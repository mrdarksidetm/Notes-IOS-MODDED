package okhttp3.internal.ws;

import ae.r;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class RealWebSocket$connect$1 implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RealWebSocket f17657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Request f17658b;

    @Override // okhttp3.Callback
    public void a(Call call, Response response) {
        r.f(call, "call");
        r.f(response, "response");
        Exchange exchangeY = response.y();
        try {
            this.f17657a.k(response, exchangeY);
            r.c(exchangeY);
            RealWebSocket.Streams streamsN = exchangeY.n();
            WebSocketExtensions webSocketExtensionsA = WebSocketExtensions.f17665g.a(response.G());
            this.f17657a.f17627d = webSocketExtensionsA;
            if (!this.f17657a.q(webSocketExtensionsA)) {
                RealWebSocket realWebSocket = this.f17657a;
                synchronized (realWebSocket) {
                    realWebSocket.f17638o.clear();
                    realWebSocket.l(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f17657a.p(Util.f17029i + " WebSocket " + this.f17658b.j().n(), streamsN);
                this.f17657a.o().f(this.f17657a, response);
                this.f17657a.r();
            } catch (Exception e10) {
                this.f17657a.n(e10, null);
            }
        } catch (IOException e11) {
            if (exchangeY != null) {
                exchangeY.v();
            }
            this.f17657a.n(e11, response);
            Util.l(response);
        }
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException iOException) {
        r.f(call, "call");
        r.f(iOException, "e");
        this.f17657a.n(iOException, null);
    }
}
