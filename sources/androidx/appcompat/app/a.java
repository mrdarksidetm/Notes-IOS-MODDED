package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0025a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f955a;

        public C0025a(int i10, int i11) {
            super(i10, i11);
            this.f955a = 8388627;
        }

        public C0025a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f955a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.j.f13567t);
            this.f955a = typedArrayObtainStyledAttributes.getInt(j.j.f13572u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0025a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f955a = 0;
        }

        public C0025a(C0025a c0025a) {
            super((ViewGroup.MarginLayoutParams) c0025a);
            this.f955a = 0;
            this.f955a = c0025a.f955a;
        }
    }

    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean m();

    public void n(Configuration configuration) {
    }

    void o() {
    }

    public abstract boolean p(int i10, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract void y();

    public p.b z(b.a aVar) {
        return null;
    }
}
