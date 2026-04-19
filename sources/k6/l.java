package k6;

import ae.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import k6.c;
import le.o;
import le.p;
import md.i0;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public interface l<T extends View> extends j {

    static final class a extends s implements zd.l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f14423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f14424c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ViewTreeObserver viewTreeObserver, b bVar) {
            super(1);
            this.f14423b = viewTreeObserver;
            this.f14424c = bVar;
        }

        public final void a(Throwable th) {
            l.this.m(this.f14423b, this.f14424c);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f14426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f14427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o<i> f14428d;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<T> lVar, ViewTreeObserver viewTreeObserver, o<? super i> oVar) {
            this.f14426b = lVar;
            this.f14427c = viewTreeObserver;
            this.f14428d = oVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            i iVarA = this.f14426b.a();
            if (iVarA != null) {
                this.f14426b.m(this.f14427c, this);
                if (!this.f14425a) {
                    this.f14425a = true;
                    this.f14428d.resumeWith(t.b(iVarA));
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    default i a() {
        c height;
        c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new i(width, height);
    }

    private default c g(int i10, int i11, int i12) {
        if (i10 == -2) {
            return c.b.f14406a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return k6.a.a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return k6.a.a(i14);
        }
        return null;
    }

    private default c getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return g(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), n() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    private default c getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return g(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), n() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = getView().getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
    }

    static /* synthetic */ <T extends View> Object u(l<T> lVar, qd.d<? super i> dVar) {
        i iVarA = lVar.a();
        if (iVarA != null) {
            return iVarA;
        }
        p pVar = new p(rd.c.c(dVar), 1);
        pVar.A();
        ViewTreeObserver viewTreeObserver = lVar.getView().getViewTreeObserver();
        b bVar = new b(lVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        pVar.p(lVar.new a(viewTreeObserver, bVar));
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }

    @Override // k6.j
    default Object c(qd.d<? super i> dVar) {
        return u(this, dVar);
    }

    T getView();

    default boolean n() {
        return true;
    }
}
