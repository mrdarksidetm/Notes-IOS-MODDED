package l1;

import android.graphics.Shader;
import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends z {
    private long createdSize;
    private Shader internalShader;

    public q1() {
        super(null);
        this.createdSize = k1.l.f14359b.a();
    }

    @Override // l1.z
    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public final void mo292applyToPq9zytI(long j10, d1 d1Var, float f10) {
        Shader shaderMo129createShaderuvyYCjk = this.internalShader;
        if (shaderMo129createShaderuvyYCjk == null || !k1.l.f(this.createdSize, j10)) {
            if (k1.l.k(j10)) {
                this.internalShader = null;
                this.createdSize = k1.l.f14359b.a();
                shaderMo129createShaderuvyYCjk = null;
            } else {
                shaderMo129createShaderuvyYCjk = mo129createShaderuvyYCjk(j10);
                this.internalShader = shaderMo129createShaderuvyYCjk;
                this.createdSize = j10;
            }
        }
        long jC = d1Var.c();
        j0.a aVar = j0.f14524b;
        if (!j0.w(jC, aVar.a())) {
            d1Var.t(aVar.a());
        }
        if (!ae.r.b(d1Var.l(), shaderMo129createShaderuvyYCjk)) {
            d1Var.k(shaderMo129createShaderuvyYCjk);
        }
        if (d1Var.a() == f10) {
            return;
        }
        d1Var.b(f10);
    }

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo129createShaderuvyYCjk(long j10);
}
