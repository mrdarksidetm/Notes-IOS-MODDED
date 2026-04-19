package p003if;

import ae.d0;
import ae.g0;
import ae.h0;
import ae.r;
import ae.s;
import hf.h;
import hf.i;
import hf.j;
import hf.l0;
import hf.u;
import hf.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import je.v;
import je.w;
import md.i0;
import md.x;
import nd.c0;
import nd.r0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(((d) t10).a(), ((d) t11).a());
        }
    }

    static final class b extends s implements p<Integer, Long, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f12735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f12737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ hf.e f12738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0 f12739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f12740f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, long j10, g0 g0Var, hf.e eVar, g0 g0Var2, g0 g0Var3) {
            super(2);
            this.f12735a = d0Var;
            this.f12736b = j10;
            this.f12737c = g0Var;
            this.f12738d = eVar;
            this.f12739e = g0Var2;
            this.f12740f = g0Var3;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 == 1) {
                d0 d0Var = this.f12735a;
                if (d0Var.f699a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                d0Var.f699a = true;
                if (j10 < this.f12736b) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                g0 g0Var = this.f12737c;
                long jW = g0Var.f704a;
                if (jW == 4294967295L) {
                    jW = this.f12738d.W();
                }
                g0Var.f704a = jW;
                g0 g0Var2 = this.f12739e;
                g0Var2.f704a = g0Var2.f704a == 4294967295L ? this.f12738d.W() : 0L;
                g0 g0Var3 = this.f12740f;
                g0Var3.f704a = g0Var3.f704a == 4294967295L ? this.f12738d.W() : 0L;
            }
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Integer num, Long l10) throws IOException {
            a(num.intValue(), l10.longValue());
            return i0.f15558a;
        }
    }

    static final class c extends s implements p<Integer, Long, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ hf.e f12741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0<Long> f12742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0<Long> f12743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0<Long> f12744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hf.e eVar, h0<Long> h0Var, h0<Long> h0Var2, h0<Long> h0Var3) {
            super(2);
            this.f12741a = eVar;
            this.f12742b = h0Var;
            this.f12743c = h0Var2;
            this.f12744d = h0Var3;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void a(int i10, long j10) throws IOException {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                int i11 = this.f12741a.readByte() & 255;
                boolean z10 = (i11 & 1) == 1;
                boolean z11 = (i11 & 2) == 2;
                boolean z12 = (i11 & 4) == 4;
                hf.e eVar = this.f12741a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f12742b.f712a = Long.valueOf(((long) eVar.K()) * 1000);
                }
                if (z11) {
                    this.f12743c.f712a = Long.valueOf(((long) this.f12741a.K()) * 1000);
                }
                if (z12) {
                    this.f12744d.f712a = Long.valueOf(((long) this.f12741a.K()) * 1000);
                }
            }
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Integer num, Long l10) throws IOException {
            a(num.intValue(), l10.longValue());
            return i0.f15558a;
        }
    }

    private static final Map<z, d> a(List<d> list) {
        z zVarE = z.a.e(z.f12027b, "/", false, 1, null);
        Map<z, d> mapJ = r0.j(x.a(zVarE, new d(zVarE, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (d dVar : c0.u0(list, new a())) {
            if (mapJ.put(dVar.a(), dVar) == null) {
                while (true) {
                    z zVarM = dVar.a().m();
                    if (zVarM != null) {
                        d dVar2 = mapJ.get(zVarM);
                        if (dVar2 != null) {
                            dVar2.b().add(dVar.a());
                            break;
                        }
                        d dVar3 = new d(zVarM, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapJ.put(zVarM, dVar3);
                        dVar3.b().add(dVar.a());
                        dVar = dVar3;
                    }
                }
            }
        }
        return mapJ;
    }

    private static final Long b(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, je.b.a(16));
        r.e(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    public static final l0 d(z zVar, j jVar, l<? super d, Boolean> lVar) throws IOException {
        long size;
        long j10;
        hf.e eVarD;
        r.f(zVar, "zipPath");
        r.f(jVar, "fileSystem");
        r.f(lVar, "predicate");
        h hVarN = jVar.n(zVar);
        try {
            size = hVarN.size() - ((long) 22);
        } finally {
        }
        if (size < 0) {
            throw new IOException("not a zip: size=" + hVarN.size());
        }
        long jMax = Math.max(size - 65536, 0L);
        do {
            hf.e eVarD2 = u.d(hVarN.G(size));
            try {
                if (eVarD2.K() == 101010256) {
                    p003if.a aVarF = f(eVarD2);
                    String strC = eVarD2.c(aVarF.b());
                    eVarD2.close();
                    long j11 = size - ((long) 20);
                    if (j11 > 0) {
                        eVarD = u.d(hVarN.G(j11));
                        try {
                            if (eVarD.K() == 117853008) {
                                int iK = eVarD.K();
                                long jW = eVarD.W();
                                if (eVarD.K() != 1 || iK != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                eVarD = u.d(hVarN.G(jW));
                                try {
                                    int iK2 = eVarD.K();
                                    if (iK2 != 101075792) {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(iK2));
                                    }
                                    aVarF = j(eVarD, aVarF);
                                    i0 i0Var = i0.f15558a;
                                    xd.b.a(eVarD, null);
                                } finally {
                                }
                            }
                            i0 i0Var2 = i0.f15558a;
                            xd.b.a(eVarD, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    eVarD = u.d(hVarN.G(aVarF.a()));
                    try {
                        long jC = aVarF.c();
                        for (j10 = 0; j10 < jC; j10++) {
                            d dVarE = e(eVarD);
                            if (dVarE.f() >= aVarF.a()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (lVar.invoke(dVarE).booleanValue()) {
                                arrayList.add(dVarE);
                            }
                        }
                        i0 i0Var3 = i0.f15558a;
                        xd.b.a(eVarD, null);
                        l0 l0Var = new l0(zVar, jVar, a(arrayList), strC);
                        xd.b.a(hVarN, null);
                        return l0Var;
                    } finally {
                        try {
                            throw th;
                        } finally {
                            xd.b.a(eVarD, th);
                        }
                    }
                }
                eVarD2.close();
                size--;
            } catch (Throwable th) {
                eVarD2.close();
                throw th;
            }
        } while (size >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    public static final d e(hf.e eVar) throws IOException {
        g0 g0Var;
        long j10;
        r.f(eVar, "<this>");
        int iK = eVar.K();
        if (iK != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iK));
        }
        eVar.skip(4L);
        int iV = eVar.V() & 65535;
        if ((iV & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(iV));
        }
        int iV2 = eVar.V() & 65535;
        Long lB = b(eVar.V() & 65535, eVar.V() & 65535);
        long jK = ((long) eVar.K()) & 4294967295L;
        g0 g0Var2 = new g0();
        g0Var2.f704a = ((long) eVar.K()) & 4294967295L;
        g0 g0Var3 = new g0();
        g0Var3.f704a = ((long) eVar.K()) & 4294967295L;
        int iV3 = eVar.V() & 65535;
        int iV4 = eVar.V() & 65535;
        int iV5 = eVar.V() & 65535;
        eVar.skip(8L);
        g0 g0Var4 = new g0();
        g0Var4.f704a = ((long) eVar.K()) & 4294967295L;
        String strC = eVar.c(iV3);
        if (w.K(strC, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (g0Var3.f704a == 4294967295L) {
            j10 = ((long) 8) + 0;
            g0Var = g0Var4;
        } else {
            g0Var = g0Var4;
            j10 = 0;
        }
        if (g0Var2.f704a == 4294967295L) {
            j10 += (long) 8;
        }
        g0 g0Var5 = g0Var;
        if (g0Var5.f704a == 4294967295L) {
            j10 += (long) 8;
        }
        long j11 = j10;
        d0 d0Var = new d0();
        g(eVar, iV4, new b(d0Var, j11, g0Var3, eVar, g0Var2, g0Var5));
        if (j11 > 0 && !d0Var.f699a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new d(z.a.e(z.f12027b, "/", false, 1, null).p(strC), v.s(strC, "/", false, 2, null), eVar.c(iV5), jK, g0Var2.f704a, g0Var3.f704a, iV2, lB, g0Var5.f704a);
    }

    private static final p003if.a f(hf.e eVar) throws IOException {
        int iV = eVar.V() & 65535;
        int iV2 = eVar.V() & 65535;
        long jV = eVar.V() & 65535;
        if (jV != (eVar.V() & 65535) || iV != 0 || iV2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eVar.skip(4L);
        return new p003if.a(jV, 4294967295L & ((long) eVar.K()), eVar.V() & 65535);
    }

    private static final void g(hf.e eVar, int i10, p<? super Integer, ? super Long, i0> pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iV = eVar.V() & 65535;
            long jV = ((long) eVar.V()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jV) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            eVar.b0(jV);
            long size = eVar.d().size();
            pVar.invoke(Integer.valueOf(iV), Long.valueOf(jV));
            long size2 = (eVar.d().size() + jV) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iV);
            }
            if (size2 > 0) {
                eVar.d().skip(size2);
            }
            j10 = j11 - jV;
        }
    }

    public static final i h(hf.e eVar, i iVar) throws IOException {
        r.f(eVar, "<this>");
        r.f(iVar, "basicMetadata");
        i iVarI = i(eVar, iVar);
        r.c(iVarI);
        return iVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final i i(hf.e eVar, i iVar) throws IOException {
        h0 h0Var = new h0();
        h0Var.f712a = iVar != null ? iVar.c() : 0;
        h0 h0Var2 = new h0();
        h0 h0Var3 = new h0();
        int iK = eVar.K();
        if (iK != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iK));
        }
        eVar.skip(2L);
        int iV = eVar.V() & 65535;
        if ((iV & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(iV));
        }
        eVar.skip(18L);
        long jV = ((long) eVar.V()) & 65535;
        int iV2 = eVar.V() & 65535;
        eVar.skip(jV);
        if (iVar == null) {
            eVar.skip(iV2);
            return null;
        }
        g(eVar, iV2, new c(eVar, h0Var, h0Var2, h0Var3));
        return new i(iVar.g(), iVar.f(), null, iVar.d(), (Long) h0Var3.f712a, (Long) h0Var.f712a, (Long) h0Var2.f712a, null, 128, null);
    }

    private static final p003if.a j(hf.e eVar, p003if.a aVar) throws IOException {
        eVar.skip(12L);
        int iK = eVar.K();
        int iK2 = eVar.K();
        long jW = eVar.W();
        if (jW != eVar.W() || iK != 0 || iK2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eVar.skip(8L);
        return new p003if.a(jW, eVar.W(), aVar.b());
    }

    public static final void k(hf.e eVar) {
        r.f(eVar, "<this>");
        i(eVar, null);
    }
}
