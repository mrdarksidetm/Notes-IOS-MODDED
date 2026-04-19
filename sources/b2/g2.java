package b2;

import android.view.View;
import b2.g2;

/* JADX INFO: loaded from: classes.dex */
public interface g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5262a = a.f5263a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f5263a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g2 f5264b = new g2() { // from class: b2.f2
            @Override // b2.g2
            public final t0.g2 a(View view) {
                return g2.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t0.g2 b(View view) {
            return i2.c(view, null, null, 3, null);
        }

        public final g2 c() {
            return f5264b;
        }
    }

    t0.g2 a(View view);
}
