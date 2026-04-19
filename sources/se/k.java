package se;

import le.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f20569c;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f20569c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20569c.run();
        } finally {
            this.f20567b.a();
        }
    }

    public String toString() {
        return "Task[" + r0.a(this.f20569c) + '@' + r0.b(this.f20569c) + ", " + this.f20566a + ", " + this.f20567b + ']';
    }
}
