package l1;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    public static final class a extends q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Shader f14488a;

        a(Shader shader) {
            this.f14488a = shader;
        }

        @Override // l1.q1
        /* JADX INFO: renamed from: createShader-uvyYCjk */
        public Shader mo129createShaderuvyYCjk(long j10) {
            return this.f14488a;
        }
    }

    public static final q1 a(Shader shader) {
        return new a(shader);
    }
}
