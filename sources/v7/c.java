package v7;

import v7.a;

/* JADX INFO: loaded from: classes.dex */
final class c extends v7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f22101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f22111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f22112l;

    static final class b extends a.AbstractC0459a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f22113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f22116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f22117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f22118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f22119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f22120h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f22121i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f22122j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f22123k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f22124l;

        b() {
        }

        @Override // v7.a.AbstractC0459a
        public v7.a a() {
            return new c(this.f22113a, this.f22114b, this.f22115c, this.f22116d, this.f22117e, this.f22118f, this.f22119g, this.f22120h, this.f22121i, this.f22122j, this.f22123k, this.f22124l);
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a b(String str) {
            this.f22124l = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a c(String str) {
            this.f22122j = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a d(String str) {
            this.f22116d = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a e(String str) {
            this.f22120h = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a f(String str) {
            this.f22115c = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a g(String str) {
            this.f22121i = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a h(String str) {
            this.f22119g = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a i(String str) {
            this.f22123k = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a j(String str) {
            this.f22114b = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a k(String str) {
            this.f22118f = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a l(String str) {
            this.f22117e = str;
            return this;
        }

        @Override // v7.a.AbstractC0459a
        public a.AbstractC0459a m(Integer num) {
            this.f22113a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f22101a = num;
        this.f22102b = str;
        this.f22103c = str2;
        this.f22104d = str3;
        this.f22105e = str4;
        this.f22106f = str5;
        this.f22107g = str6;
        this.f22108h = str7;
        this.f22109i = str8;
        this.f22110j = str9;
        this.f22111k = str10;
        this.f22112l = str11;
    }

    @Override // v7.a
    public String b() {
        return this.f22112l;
    }

    @Override // v7.a
    public String c() {
        return this.f22110j;
    }

    @Override // v7.a
    public String d() {
        return this.f22104d;
    }

    @Override // v7.a
    public String e() {
        return this.f22108h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v7.a)) {
            return false;
        }
        v7.a aVar = (v7.a) obj;
        Integer num = this.f22101a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f22102b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f22103c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f22104d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f22105e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f22106f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f22107g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f22108h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f22109i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f22110j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f22111k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f22112l;
                                                    String strB = aVar.b();
                                                    if (str11 == null) {
                                                        if (strB == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(strB)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // v7.a
    public String f() {
        return this.f22103c;
    }

    @Override // v7.a
    public String g() {
        return this.f22109i;
    }

    @Override // v7.a
    public String h() {
        return this.f22107g;
    }

    public int hashCode() {
        Integer num = this.f22101a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f22102b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22103c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22104d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22105e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f22106f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f22107g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f22108h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f22109i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f22110j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f22111k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f22112l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // v7.a
    public String i() {
        return this.f22111k;
    }

    @Override // v7.a
    public String j() {
        return this.f22102b;
    }

    @Override // v7.a
    public String k() {
        return this.f22106f;
    }

    @Override // v7.a
    public String l() {
        return this.f22105e;
    }

    @Override // v7.a
    public Integer m() {
        return this.f22101a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f22101a + ", model=" + this.f22102b + ", hardware=" + this.f22103c + ", device=" + this.f22104d + ", product=" + this.f22105e + ", osBuild=" + this.f22106f + ", manufacturer=" + this.f22107g + ", fingerprint=" + this.f22108h + ", locale=" + this.f22109i + ", country=" + this.f22110j + ", mccMnc=" + this.f22111k + ", applicationBuild=" + this.f22112l + "}";
    }
}
