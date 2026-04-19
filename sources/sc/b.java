package sc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public interface a {
        void a(ByteBuffer byteBuffer, InterfaceC0419b interfaceC0419b);
    }

    /* JADX INFO: renamed from: sc.b$b, reason: collision with other inner class name */
    public interface InterfaceC0419b {
        void a(ByteBuffer byteBuffer);
    }

    public interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20489a = true;

        public boolean a() {
            return this.f20489a;
        }
    }

    default c a(d dVar) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }

    void b(String str, ByteBuffer byteBuffer, InterfaceC0419b interfaceC0419b);

    default c c() {
        return a(new d());
    }

    void d(String str, ByteBuffer byteBuffer);

    default void e(String str, a aVar, c cVar) {
        if (cVar != null) {
            throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
        }
        f(str, aVar);
    }

    void f(String str, a aVar);
}
