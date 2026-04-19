package l3;

import android.graphics.Typeface;
import android.os.Handler;
import l3.f;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f14693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f14694b;

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    class RunnableC0340a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f14695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f14696b;

        RunnableC0340a(g.c cVar, Typeface typeface) {
            this.f14695a = cVar;
            this.f14696b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14695a.b(this.f14696b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f14698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14699b;

        b(g.c cVar, int i10) {
            this.f14698a = cVar;
            this.f14699b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14698a.a(this.f14699b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f14693a = cVar;
        this.f14694b = handler;
    }

    private void a(int i10) {
        this.f14694b.post(new b(this.f14693a, i10));
    }

    private void c(Typeface typeface) {
        this.f14694b.post(new RunnableC0340a(this.f14693a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f14723a);
        } else {
            a(eVar.f14724b);
        }
    }
}
