package t2;

import ae.s;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k1.l;
import l1.q1;
import r2.h;
import t0.f3;
import t0.k1;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f21212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f21214c = k3.e(l.c(l.f14359b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3<Shader> f21215d = f3.e(new a());

    static final class a extends s implements zd.a<Shader> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if ((b.this.b() == l.f14359b.a()) || l.k(b.this.b())) {
                return null;
            }
            return b.this.a().mo129createShaderuvyYCjk(b.this.b());
        }
    }

    public b(q1 q1Var, float f10) {
        this.f21212a = q1Var;
        this.f21213b = f10;
    }

    public final q1 a() {
        return this.f21212a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((l) this.f21214c.getValue()).m();
    }

    public final void c(long j10) {
        this.f21214c.setValue(l.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.f21213b);
        textPaint.setShader(this.f21215d.getValue());
    }
}
