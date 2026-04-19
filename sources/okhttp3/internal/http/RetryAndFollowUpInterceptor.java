package okhttp3.internal.http;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import nd.c0;
import nd.u;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f17282b = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f17283a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        r.f(okHttpClient, "client");
        this.f17283a = okHttpClient;
    }

    private final Request b(Response response, String str) {
        String strE;
        HttpUrl httpUrlO;
        RequestBody requestBodyA = null;
        if (!this.f17283a.r() || (strE = Response.E(response, "Location", null, 2, null)) == null || (httpUrlO = response.Y().j().o(strE)) == null) {
            return null;
        }
        if (!r.b(httpUrlO.p(), response.Y().j().p()) && !this.f17283a.s()) {
            return null;
        }
        Request.Builder builderI = response.Y().i();
        if (HttpMethod.b(str)) {
            int iW = response.w();
            HttpMethod httpMethod = HttpMethod.f17268a;
            boolean z10 = httpMethod.d(str) || iW == 308 || iW == 307;
            if (httpMethod.c(str) && iW != 308 && iW != 307) {
                str = "GET";
            } else if (z10) {
                requestBodyA = response.Y().a();
            }
            builderI.h(str, requestBodyA);
            if (!z10) {
                builderI.i("Transfer-Encoding");
                builderI.i("Content-Length");
                builderI.i("Content-Type");
            }
        }
        if (!Util.j(response.Y().j(), httpUrlO)) {
            builderI.i("Authorization");
        }
        return builderI.q(httpUrlO).b();
    }

    private final Request c(Response response, Exchange exchange) throws ProtocolException {
        RealConnection realConnectionH;
        Route routeA = (exchange == null || (realConnectionH = exchange.h()) == null) ? null : realConnectionH.A();
        int iW = response.w();
        String strH = response.Y().h();
        if (iW != 307 && iW != 308) {
            if (iW == 401) {
                return this.f17283a.e().a(routeA, response);
            }
            if (iW == 421) {
                RequestBody requestBodyA = response.Y().a();
                if ((requestBodyA != null && requestBodyA.d()) || exchange == null || !exchange.l()) {
                    return null;
                }
                exchange.h().y();
                return response.Y();
            }
            if (iW == 503) {
                Response responseP = response.P();
                if ((responseP == null || responseP.w() != 503) && g(response, a.e.API_PRIORITY_OTHER) == 0) {
                    return response.Y();
                }
                return null;
            }
            if (iW == 407) {
                r.c(routeA);
                if (routeA.b().type() == Proxy.Type.HTTP) {
                    return this.f17283a.C().a(routeA, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iW == 408) {
                if (!this.f17283a.F()) {
                    return null;
                }
                RequestBody requestBodyA2 = response.Y().a();
                if (requestBodyA2 != null && requestBodyA2.d()) {
                    return null;
                }
                Response responseP2 = response.P();
                if ((responseP2 == null || responseP2.w() != 408) && g(response, 0) <= 0) {
                    return response.Y();
                }
                return null;
            }
            switch (iW) {
                case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(response, strH);
    }

    private final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, RealCall realCall, Request request, boolean z10) {
        if (this.f17283a.F()) {
            return !(z10 && f(iOException, request)) && d(iOException, z10) && realCall.A();
        }
        return false;
    }

    private final boolean f(IOException iOException, Request request) {
        RequestBody requestBodyA = request.a();
        return (requestBodyA != null && requestBodyA.d()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(Response response, int i10) {
        String strE = Response.E(response, "Retry-After", null, 2, null);
        if (strE == null) {
            return i10;
        }
        if (!new je.j("\\d+").e(strE)) {
            return a.e.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strE);
        r.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        IOException e10;
        Exchange exchangeQ;
        Request requestC;
        r.f(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request requestI = realInterceptorChain.i();
        RealCall realCallE = realInterceptorChain.e();
        List listM = u.m();
        Response response = null;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            realCallE.i(requestI, z10);
            try {
                if (realCallE.w()) {
                    throw new IOException("Canceled");
                }
                try {
                    Response responseA = realInterceptorChain.a(requestI);
                    if (response != null) {
                        responseA = responseA.M().p(response.M().b(null).c()).c();
                    }
                    response = responseA;
                    exchangeQ = realCallE.q();
                    requestC = c(response, exchangeQ);
                } catch (IOException e11) {
                    e10 = e11;
                    if (!e(e10, realCallE, requestI, !(e10 instanceof ConnectionShutdownException))) {
                        throw Util.a0(e10, listM);
                    }
                    listM = c0.o0(listM, e10);
                    realCallE.j(true);
                    z10 = false;
                } catch (RouteException e12) {
                    if (!e(e12.c(), realCallE, requestI, false)) {
                        throw Util.a0(e12.b(), listM);
                    }
                    e10 = e12.b();
                    listM = c0.o0(listM, e10);
                    realCallE.j(true);
                    z10 = false;
                }
                if (requestC == null) {
                    if (exchangeQ != null && exchangeQ.m()) {
                        realCallE.C();
                    }
                    realCallE.j(false);
                    return response;
                }
                RequestBody requestBodyA = requestC.a();
                if (requestBodyA != null && requestBodyA.d()) {
                    realCallE.j(false);
                    return response;
                }
                ResponseBody responseBodyA = response.a();
                if (responseBodyA != null) {
                    Util.l(responseBodyA);
                }
                i10++;
                if (i10 > 20) {
                    throw new ProtocolException(r.m("Too many follow-up requests: ", Integer.valueOf(i10)));
                }
                realCallE.j(true);
                requestI = requestC;
                z10 = true;
            } catch (Throwable th) {
                realCallE.j(true);
                throw th;
            }
        }
    }
}
