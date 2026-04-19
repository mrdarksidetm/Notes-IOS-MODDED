package j1;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.LinkedHashSet;
import java.util.Set;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<zd.a<i0>, i0> f13806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<FocusTargetNode> f13807b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<c> f13808c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<j> f13809d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.a<i0> f13810e = new a();

    static final class a extends ae.s implements zd.a<i0> {
        a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cc -> B:43:0x00af). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2() {
            /*
                Method dump skipped, instruction units count: 915
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.e.a.invoke2():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(zd.l<? super zd.a<i0>, i0> lVar) {
        this.f13806a = lVar;
    }

    private final <T> void g(Set<T> set, T t10) {
        if (set.add(t10) && this.f13807b.size() + this.f13808c.size() + this.f13809d.size() == 1) {
            this.f13806a.invoke(this.f13810e);
        }
    }

    public final void d(FocusTargetNode focusTargetNode) {
        g(this.f13807b, focusTargetNode);
    }

    public final void e(c cVar) {
        g(this.f13808c, cVar);
    }

    public final void f(j jVar) {
        g(this.f13809d, jVar);
    }
}
