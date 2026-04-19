package com.amazon.a.a.n.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f7402a;

    @Override // com.amazon.a.a.n.c.c
    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.f7402a, "workflow instance can only be set once");
        this.f7402a = bVar;
    }

    protected final boolean m() {
        return this.f7402a != null;
    }

    protected final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.f7402a.d();
    }
}
