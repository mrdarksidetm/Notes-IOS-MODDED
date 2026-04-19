package xd;

import ae.r;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(File file, File file2, String str) {
        super(file, file2, str);
        r.f(file, "file");
    }

    public /* synthetic */ m(File file, File file2, String str, int i10, ae.j jVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
