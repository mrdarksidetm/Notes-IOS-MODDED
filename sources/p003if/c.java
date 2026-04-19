package p003if;

import ae.r;
import ae.s;
import hf.g0;
import hf.h;
import hf.i;
import hf.i0;
import hf.j;
import hf.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import je.v;
import je.w;
import md.l;
import md.n;
import md.x;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f12720f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final z f12721g = z.a.e(z.f12027b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f12722e;

    private static final class a {

        /* JADX INFO: renamed from: if.c$a$a, reason: collision with other inner class name */
        static final class C0306a extends s implements zd.l<d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0306a f12723a = new C0306a();

            C0306a() {
                super(1);
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(d dVar) {
                r.f(dVar, "entry");
                return Boolean.valueOf(c.f12720f.c(dVar.a()));
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(z zVar) {
            return !v.r(zVar.j(), ".class", true);
        }

        public final z b() {
            return c.f12721g;
        }

        public final z d(z zVar, z zVar2) {
            r.f(zVar, "<this>");
            r.f(zVar2, "base");
            return b().p(v.B(w.r0(zVar.toString(), zVar2.toString()), '\\', '/', false, 4, null));
        }

        public final List<md.s<j, z>> e(ClassLoader classLoader) throws IOException {
            r.f(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            r.e(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            r.e(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                a aVar = c.f12720f;
                r.e(url, "it");
                md.s<j, z> sVarF = aVar.f(url);
                if (sVarF != null) {
                    arrayList.add(sVarF);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            r.e(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            r.e(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL url2 : list2) {
                a aVar2 = c.f12720f;
                r.e(url2, "it");
                md.s<j, z> sVarG = aVar2.g(url2);
                if (sVarG != null) {
                    arrayList2.add(sVarG);
                }
            }
            return c0.n0(arrayList, arrayList2);
        }

        public final md.s<j, z> f(URL url) {
            r.f(url, "<this>");
            if (r.b(url.getProtocol(), "file")) {
                return x.a(j.f11987b, z.a.d(z.f12027b, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        public final md.s<j, z> g(URL url) {
            int iD0;
            r.f(url, "<this>");
            String string = url.toString();
            r.e(string, "toString()");
            if (!v.G(string, "jar:file:", false, 2, null) || (iD0 = w.d0(string, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            z.a aVar = z.f12027b;
            String strSubstring = string.substring(4, iD0);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return x.a(e.d(z.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), j.f11987b, C0306a.f12723a), b());
        }
    }

    static final class b extends s implements zd.a<List<? extends md.s<? extends j, ? extends z>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f12724a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f12724a = classLoader;
        }

        @Override // zd.a
        public final List<? extends md.s<? extends j, ? extends z>> invoke() {
            return c.f12720f.e(this.f12724a);
        }
    }

    public c(ClassLoader classLoader, boolean z10) {
        r.f(classLoader, "classLoader");
        this.f12722e = n.b(new b(classLoader));
        if (z10) {
            u().size();
        }
    }

    private final z t(z zVar) {
        return f12721g.o(zVar, true);
    }

    private final List<md.s<j, z>> u() {
        return (List) this.f12722e.getValue();
    }

    private final String v(z zVar) {
        return t(zVar).n(f12721g).toString();
    }

    @Override // hf.j
    public g0 b(z zVar, boolean z10) throws IOException {
        r.f(zVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // hf.j
    public void c(z zVar, z zVar2) throws IOException {
        r.f(zVar, "source");
        r.f(zVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // hf.j
    public void g(z zVar, boolean z10) throws IOException {
        r.f(zVar, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // hf.j
    public void i(z zVar, boolean z10) throws IOException {
        r.f(zVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // hf.j
    public List<z> k(z zVar) throws FileNotFoundException {
        r.f(zVar, "dir");
        String strV = v(zVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (md.s<j, z> sVar : u()) {
            j jVarA = sVar.a();
            z zVarB = sVar.b();
            try {
                List<z> listK = jVarA.k(zVarB.p(strV));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (f12720f.c((z) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(nd.v.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f12720f.d((z) it.next(), zVarB));
                }
                nd.z.C(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return c0.C0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override // hf.j
    public i m(z zVar) {
        r.f(zVar, "path");
        if (!f12720f.c(zVar)) {
            return null;
        }
        String strV = v(zVar);
        for (md.s<j, z> sVar : u()) {
            i iVarM = sVar.a().m(sVar.b().p(strV));
            if (iVarM != null) {
                return iVarM;
            }
        }
        return null;
    }

    @Override // hf.j
    public h n(z zVar) throws FileNotFoundException {
        r.f(zVar, "file");
        if (!f12720f.c(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        String strV = v(zVar);
        for (md.s<j, z> sVar : u()) {
            try {
                return sVar.a().n(sVar.b().p(strV));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override // hf.j
    public g0 p(z zVar, boolean z10) throws IOException {
        r.f(zVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // hf.j
    public i0 q(z zVar) throws FileNotFoundException {
        r.f(zVar, "file");
        if (!f12720f.c(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        String strV = v(zVar);
        for (md.s<j, z> sVar : u()) {
            try {
                return sVar.a().q(sVar.b().p(strV));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }
}
