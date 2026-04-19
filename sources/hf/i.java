package hf;

import java.util.ArrayList;
import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f11980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f11981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f11982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f11983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f11984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<he.c<?>, Object> f11985h;

    public i(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13, Map<he.c<?>, ? extends Object> map) {
        ae.r.f(map, "extras");
        this.f11978a = z10;
        this.f11979b = z11;
        this.f11980c = zVar;
        this.f11981d = l10;
        this.f11982e = l11;
        this.f11983f = l12;
        this.f11984g = l13;
        this.f11985h = r0.t(map);
    }

    public /* synthetic */ i(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13, Map map, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : zVar, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) == 0 ? l13 : null, (i10 & 128) != 0 ? r0.e() : map);
    }

    public final i a(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13, Map<he.c<?>, ? extends Object> map) {
        ae.r.f(map, "extras");
        return new i(z10, z11, zVar, l10, l11, l12, l13, map);
    }

    public final Long c() {
        return this.f11983f;
    }

    public final Long d() {
        return this.f11981d;
    }

    public final z e() {
        return this.f11980c;
    }

    public final boolean f() {
        return this.f11979b;
    }

    public final boolean g() {
        return this.f11978a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f11978a) {
            arrayList.add("isRegularFile");
        }
        if (this.f11979b) {
            arrayList.add("isDirectory");
        }
        if (this.f11981d != null) {
            arrayList.add("byteCount=" + this.f11981d);
        }
        if (this.f11982e != null) {
            arrayList.add("createdAt=" + this.f11982e);
        }
        if (this.f11983f != null) {
            arrayList.add("lastModifiedAt=" + this.f11983f);
        }
        if (this.f11984g != null) {
            arrayList.add("lastAccessedAt=" + this.f11984g);
        }
        if (!this.f11985h.isEmpty()) {
            arrayList.add("extras=" + this.f11985h);
        }
        return nd.c0.h0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}
