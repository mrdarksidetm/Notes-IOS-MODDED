package s2;

import android.text.style.TtsSpan;
import i2.i0;
import i2.k0;
import md.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final TtsSpan a(i0 i0Var) {
        if (i0Var instanceof k0) {
            return b((k0) i0Var);
        }
        throw new q();
    }

    public static final TtsSpan b(k0 k0Var) {
        return new TtsSpan.VerbatimBuilder(k0Var.a()).build();
    }
}
