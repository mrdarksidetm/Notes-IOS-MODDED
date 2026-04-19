package okhttp3;

import ae.r;
import hf.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WebSocketListener {
    public void a(WebSocket webSocket, int i10, String str) {
        r.f(webSocket, "webSocket");
        r.f(str, "reason");
    }

    public void b(WebSocket webSocket, int i10, String str) {
        r.f(webSocket, "webSocket");
        r.f(str, "reason");
    }

    public void c(WebSocket webSocket, Throwable th, Response response) {
        r.f(webSocket, "webSocket");
        r.f(th, "t");
    }

    public void d(WebSocket webSocket, f fVar) {
        r.f(webSocket, "webSocket");
        r.f(fVar, "bytes");
    }

    public void e(WebSocket webSocket, String str) {
        r.f(webSocket, "webSocket");
        r.f(str, "text");
    }

    public void f(WebSocket webSocket, Response response) {
        r.f(webSocket, "webSocket");
        r.f(response, "response");
    }
}
