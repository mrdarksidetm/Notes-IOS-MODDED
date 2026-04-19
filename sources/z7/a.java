package z7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f24255e = new C0501a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f24256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f24257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f24258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24259d;

    /* JADX INFO: renamed from: z7.a$a, reason: collision with other inner class name */
    public static final class C0501a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f24260a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f24261b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f24262c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24263d = "";

        C0501a() {
        }

        public C0501a a(d dVar) {
            this.f24261b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f24260a, Collections.unmodifiableList(this.f24261b), this.f24262c, this.f24263d);
        }

        public C0501a c(String str) {
            this.f24263d = str;
            return this;
        }

        public C0501a d(b bVar) {
            this.f24262c = bVar;
            return this;
        }

        public C0501a e(f fVar) {
            this.f24260a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f24256a = fVar;
        this.f24257b = list;
        this.f24258c = bVar;
        this.f24259d = str;
    }

    public static C0501a e() {
        return new C0501a();
    }

    public String a() {
        return this.f24259d;
    }

    public b b() {
        return this.f24258c;
    }

    public List<d> c() {
        return this.f24257b;
    }

    public f d() {
        return this.f24256a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
