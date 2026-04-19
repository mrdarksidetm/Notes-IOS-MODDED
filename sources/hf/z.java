package hf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Comparable<z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12027b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12028c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f12029a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public static /* synthetic */ z d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ z e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ z f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final z a(File file, boolean z10) {
            ae.r.f(file, "<this>");
            String string = file.toString();
            ae.r.e(string, "toString()");
            return b(string, z10);
        }

        public final z b(String str, boolean z10) {
            ae.r.f(str, "<this>");
            return p003if.i.k(str, z10);
        }

        @IgnoreJRERequirement
        public final z c(Path path, boolean z10) {
            ae.r.f(path, "<this>");
            return b(path.toString(), z10);
        }
    }

    static {
        String str = File.separator;
        ae.r.e(str, "separator");
        f12028c = str;
    }

    public z(f fVar) {
        ae.r.f(fVar, "bytes");
        this.f12029a = fVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z zVar) {
        ae.r.f(zVar, "other");
        return b().compareTo(zVar.b());
    }

    public final f b() {
        return this.f12029a;
    }

    public final z c() {
        int iO = p003if.i.o(this);
        if (iO == -1) {
            return null;
        }
        return new z(b().H(0, iO));
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && ae.r.b(((z) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final List<f> i() {
        ArrayList arrayList = new ArrayList();
        int iO = p003if.i.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < b().F() && b().j(iO) == 92) {
            iO++;
        }
        int iF = b().F();
        int i10 = iO;
        while (iO < iF) {
            if (b().j(iO) == 47 || b().j(iO) == 92) {
                arrayList.add(b().H(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < b().F()) {
            arrayList.add(b().H(i10, b().F()));
        }
        return arrayList;
    }

    public final boolean isAbsolute() {
        return p003if.i.o(this) != -1;
    }

    public final String j() {
        return l().K();
    }

    public final f l() {
        int iL = p003if.i.l(this);
        return iL != -1 ? f.I(b(), iL + 1, 0, 2, null) : (r() == null || b().F() != 2) ? b() : f.f11961e;
    }

    public final z m() {
        z zVar;
        if (ae.r.b(b(), p003if.i.f12750d) || ae.r.b(b(), p003if.i.f12747a) || ae.r.b(b(), p003if.i.f12748b) || p003if.i.n(this)) {
            return null;
        }
        int iL = p003if.i.l(this);
        if (iL != 2 || r() == null) {
            if (iL == 1 && b().G(p003if.i.f12748b)) {
                return null;
            }
            if (iL != -1 || r() == null) {
                if (iL == -1) {
                    return new z(p003if.i.f12750d);
                }
                if (iL != 0) {
                    return new z(f.I(b(), 0, iL, 1, null));
                }
                zVar = new z(f.I(b(), 0, 1, 1, null));
            } else {
                if (b().F() == 2) {
                    return null;
                }
                zVar = new z(f.I(b(), 0, 2, 1, null));
            }
        } else {
            if (b().F() == 3) {
                return null;
            }
            zVar = new z(f.I(b(), 0, 3, 1, null));
        }
        return zVar;
    }

    public final z n(z zVar) {
        ae.r.f(zVar, "other");
        if (!ae.r.b(c(), zVar.c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + zVar).toString());
        }
        List<f> listI = i();
        List<f> listI2 = zVar.i();
        int iMin = Math.min(listI.size(), listI2.size());
        int i10 = 0;
        while (i10 < iMin && ae.r.b(listI.get(i10), listI2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && b().F() == zVar.b().F()) {
            return a.e(f12027b, ".", false, 1, null);
        }
        if (!(listI2.subList(i10, listI2.size()).indexOf(p003if.i.f12751e) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + zVar).toString());
        }
        c cVar = new c();
        f fVarM = p003if.i.m(zVar);
        if (fVarM == null && (fVarM = p003if.i.m(this)) == null) {
            fVarM = p003if.i.s(f12028c);
        }
        int size = listI2.size();
        for (int i11 = i10; i11 < size; i11++) {
            cVar.g(p003if.i.f12751e);
            cVar.g(fVarM);
        }
        int size2 = listI.size();
        while (i10 < size2) {
            cVar.g(listI.get(i10));
            cVar.g(fVarM);
            i10++;
        }
        return p003if.i.q(cVar, false);
    }

    public final z o(z zVar, boolean z10) {
        ae.r.f(zVar, "child");
        return p003if.i.j(this, zVar, z10);
    }

    public final z p(String str) {
        ae.r.f(str, "child");
        return p003if.i.j(this, p003if.i.q(new c().z(str), false), false);
    }

    @IgnoreJRERequirement
    public final Path q() {
        Path path = Paths.get(toString(), new String[0]);
        ae.r.e(path, "get(toString())");
        return path;
    }

    public final Character r() {
        boolean z10 = false;
        if (f.s(b(), p003if.i.f12747a, 0, 2, null) != -1 || b().F() < 2 || b().j(1) != 58) {
            return null;
        }
        char cJ = (char) b().j(0);
        if (!('a' <= cJ && cJ < '{')) {
            if ('A' <= cJ && cJ < '[') {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        }
        return Character.valueOf(cJ);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return b().K();
    }
}
