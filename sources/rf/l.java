package rf;

import java.util.ArrayList;
import java.util.List;
import uf.v;

/* JADX INFO: loaded from: classes2.dex */
public class l extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.n f19528a = new uf.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CharSequence> f19529b = new ArrayList();

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            return (hVar.c() < tf.f.f21413a || hVar.b() || (hVar.f().g() instanceof v)) ? wf.f.c() : wf.f.d(new l()).a(hVar.a() + tf.f.f21413a);
        }
    }

    @Override // wf.a, wf.d
    public void b() {
        int size = this.f19529b.size() - 1;
        while (size >= 0 && tf.f.f(this.f19529b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.f19529b.get(i10));
            sb2.append('\n');
        }
        this.f19528a.o(sb2.toString());
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        return hVar.c() >= tf.f.f21413a ? wf.c.a(hVar.a() + tf.f.f21413a) : hVar.b() ? wf.c.b(hVar.e()) : wf.c.d();
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19528a;
    }

    @Override // wf.a, wf.d
    public void i(vf.g gVar) {
        this.f19529b.add(gVar.a());
    }
}
