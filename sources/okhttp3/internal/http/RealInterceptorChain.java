package okhttp3.internal.http;

import ae.r;
import java.util.List;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RealCall f17269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Interceptor> f17270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Exchange f17272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Request f17273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17277i;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        r.f(realCall, "call");
        r.f(list, "interceptors");
        r.f(request, "request");
        this.f17269a = realCall;
        this.f17270b = list;
        this.f17271c = i10;
        this.f17272d = exchange;
        this.f17273e = request;
        this.f17274f = i11;
        this.f17275g = i12;
        this.f17276h = i13;
    }

    public static /* synthetic */ RealInterceptorChain d(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = realInterceptorChain.f17271c;
        }
        if ((i14 & 2) != 0) {
            exchange = realInterceptorChain.f17272d;
        }
        Exchange exchange2 = exchange;
        if ((i14 & 4) != 0) {
            request = realInterceptorChain.f17273e;
        }
        Request request2 = request;
        if ((i14 & 8) != 0) {
            i11 = realInterceptorChain.f17274f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = realInterceptorChain.f17275g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = realInterceptorChain.f17276h;
        }
        return realInterceptorChain.c(i10, exchange2, request2, i15, i16, i13);
    }

    @Override // okhttp3.Interceptor.Chain
    public Response a(Request request) {
        r.f(request, "request");
        if (!(this.f17271c < this.f17270b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f17277i++;
        Exchange exchange = this.f17272d;
        if (exchange != null) {
            if (!exchange.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.f17270b.get(this.f17271c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f17277i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f17270b.get(this.f17271c - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainD = d(this, this.f17271c + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = this.f17270b.get(this.f17271c);
        Response responseA = interceptor.a(realInterceptorChainD);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.f17272d != null) {
            if (!(this.f17271c + 1 >= this.f17270b.size() || realInterceptorChainD.f17277i == 1)) {
                throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
            }
        }
        if (responseA.a() != null) {
            return responseA;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Request b() {
        return this.f17273e;
    }

    public final RealInterceptorChain c(int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        r.f(request, "request");
        return new RealInterceptorChain(this.f17269a, this.f17270b, i10, exchange, request, i11, i12, i13);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f17269a;
    }

    public final RealCall e() {
        return this.f17269a;
    }

    public final int f() {
        return this.f17274f;
    }

    public final Exchange g() {
        return this.f17272d;
    }

    public final int h() {
        return this.f17275g;
    }

    public final Request i() {
        return this.f17273e;
    }

    public final int j() {
        return this.f17276h;
    }

    public int k() {
        return this.f17275g;
    }
}
