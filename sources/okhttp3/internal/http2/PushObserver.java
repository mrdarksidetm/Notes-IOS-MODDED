package okhttp3.internal.http2;

import ae.r;
import hf.e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface PushObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17529a = Companion.f17531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PushObserver f17530b = new Companion.PushObserverCancel();

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17531a = new Companion();

        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean a(int i10, e eVar, int i11, boolean z10) {
                r.f(eVar, "source");
                eVar.skip(i11);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean b(int i10, List<Header> list) {
                r.f(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean c(int i10, List<Header> list, boolean z10) {
                r.f(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void d(int i10, ErrorCode errorCode) {
                r.f(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean a(int i10, e eVar, int i11, boolean z10);

    boolean b(int i10, List<Header> list);

    boolean c(int i10, List<Header> list, boolean z10);

    void d(int i10, ErrorCode errorCode);
}
