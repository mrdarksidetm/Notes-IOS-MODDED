package r2;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import l1.a0;
import l1.b0;
import l1.q1;
import l1.s1;
import l1.u1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final void a(i2.h hVar, b0 b0Var, z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        b0Var.h();
        if (hVar.v().size() <= 1 || (zVar instanceof u1)) {
            b(hVar, b0Var, zVar, f10, s1Var, jVar, gVar, i10);
        } else if (zVar instanceof q1) {
            List<i2.n> listV = hVar.v();
            int size = listV.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                i2.n nVar = listV.get(i11);
                height += nVar.e().getHeight();
                fMax = Math.max(fMax, nVar.e().getWidth());
            }
            Shader shaderMo129createShaderuvyYCjk = ((q1) zVar).mo129createShaderuvyYCjk(k1.m.a(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo129createShaderuvyYCjk.getLocalMatrix(matrix);
            List<i2.n> listV2 = hVar.v();
            int size2 = listV2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                i2.n nVar2 = listV2.get(i12);
                nVar2.e().s(b0Var, a0.a(shaderMo129createShaderuvyYCjk), f10, s1Var, jVar, gVar, i10);
                b0Var.c(0.0f, nVar2.e().getHeight());
                matrix.setTranslate(0.0f, -nVar2.e().getHeight());
                shaderMo129createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        b0Var.p();
    }

    private static final void b(i2.h hVar, b0 b0Var, z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        List<i2.n> listV = hVar.v();
        int size = listV.size();
        for (int i11 = 0; i11 < size; i11++) {
            i2.n nVar = listV.get(i11);
            nVar.e().s(b0Var, zVar, f10, s1Var, jVar, gVar, i10);
            b0Var.c(0.0f, nVar.e().getHeight());
        }
    }
}
