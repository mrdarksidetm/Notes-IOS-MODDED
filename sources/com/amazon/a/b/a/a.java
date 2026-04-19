package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f7529a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7530b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.f7530b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb2 = new StringBuilder();
        for (com.amazon.a.a.o.d.a aVar : cVar) {
            if (sb2.length() != 0) {
                sb2.append(f.f7478a);
            }
            sb2.append(aVar.a().a());
        }
        return sb2.toString();
    }

    public c d() {
        return this.f7530b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f7530b.toString();
    }
}
