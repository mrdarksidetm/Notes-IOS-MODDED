package sa;

import w8.m;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20477a;

    public a(String str, int i10) {
        super(m.f(str, "Provided message must not be empty."));
        this.f20477a = i10;
    }

    public a(String str, int i10, Throwable th) {
        super(m.f(str, "Provided message must not be empty."), th);
        this.f20477a = i10;
    }
}
