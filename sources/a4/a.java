package a4;

import ae.r;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th) {
        super(str, th);
        r.f(str, "message");
    }

    public /* synthetic */ a(String str, Throwable th, int i10, ae.j jVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
