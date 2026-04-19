package vf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rf.m;
import rf.n;
import rf.p;
import uf.s;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<wf.e> f22353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<xf.a> f22354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f22355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<f> f22356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vf.a f22357e;

    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f22362e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<wf.e> f22358a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<xf.a> f22359b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<f> f22360c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<Class<? extends uf.a>> f22361d = rf.h.t();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private vf.a f22363f = vf.a.NONE;

        class a implements d {
            a() {
            }

            @Override // vf.d
            public vf.b a(vf.c cVar) {
                return new n(cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public d j() {
            d dVar = this.f22362e;
            return dVar != null ? dVar : new a();
        }

        public e g() {
            return new e(this);
        }

        public b h(xf.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.f22359b.add(aVar);
            return this;
        }

        public b i(Iterable<? extends of.a> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (of.a aVar : iterable) {
                if (aVar instanceof c) {
                    ((c) aVar).a(this);
                }
            }
            return this;
        }
    }

    public interface c extends of.a {
        void a(b bVar);
    }

    private e(b bVar) {
        this.f22353a = rf.h.m(bVar.f22358a, bVar.f22361d);
        d dVarJ = bVar.j();
        this.f22355c = dVarJ;
        this.f22356d = bVar.f22360c;
        List<xf.a> list = bVar.f22359b;
        this.f22354b = list;
        this.f22357e = bVar.f22363f;
        dVarJ.a(new m(list, new p()));
    }

    public static b a() {
        return new b();
    }

    private rf.h b() {
        return new rf.h(this.f22353a, this.f22355c, this.f22354b, this.f22357e);
    }

    private s d(s sVar) {
        Iterator<f> it = this.f22356d.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public s c(String str) {
        if (str != null) {
            return d(b().u(str));
        }
        throw new NullPointerException("input must not be null");
    }
}
