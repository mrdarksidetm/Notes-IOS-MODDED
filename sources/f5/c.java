package f5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f11124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f11125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11126c;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11129c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<b> f11127a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f11128b = new ArrayList();

        private List<String> f() {
            return this.f11128b;
        }

        private List<b> h() {
            return this.f11127a;
        }

        private boolean j() {
            return this.f11129c;
        }

        public a a(String str) {
            this.f11128b.add(str);
            return this;
        }

        public a b(String str) {
            this.f11127a.add(new b(str, "direct://"));
            return this;
        }

        public a c(String str) {
            this.f11127a.add(new b(str));
            return this;
        }

        public a d(String str, String str2) {
            this.f11127a.add(new b(str2, str));
            return this;
        }

        public c e() {
            return new c(h(), f(), j());
        }

        public a g() {
            return a("<local>");
        }

        public a i() {
            return a("<-loopback>");
        }

        public a k(boolean z10) {
            this.f11129c = z10;
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11131b;

        public b(String str) {
            this("*", str);
        }

        public b(String str, String str2) {
            this.f11130a = str;
            this.f11131b = str2;
        }

        public String a() {
            return this.f11130a;
        }

        public String b() {
            return this.f11131b;
        }
    }

    public c(List<b> list, List<String> list2, boolean z10) {
        this.f11124a = list;
        this.f11125b = list2;
        this.f11126c = z10;
    }

    public List<String> a() {
        return Collections.unmodifiableList(this.f11125b);
    }

    public List<b> b() {
        return Collections.unmodifiableList(this.f11124a);
    }

    public boolean c() {
        return this.f11126c;
    }
}
