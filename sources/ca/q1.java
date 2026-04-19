package ca;

/* JADX INFO: loaded from: classes2.dex */
final class q1 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6736c;

    private q1(String str, String str2, String str3) {
        this.f6734a = str;
        this.f6735b = str2;
        this.f6736c = str3;
    }

    @Override // ca.m1
    public final String b() {
        return this.f6735b;
    }

    @Override // ca.m1
    public final String c() {
        return this.f6736c;
    }

    @Override // ca.m1
    public final String d() {
        return this.f6734a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            String str = this.f6734a;
            if (str != null ? str.equals(m1Var.d()) : m1Var.d() == null) {
                String str2 = this.f6735b;
                if (str2 != null ? str2.equals(m1Var.b()) : m1Var.b() == null) {
                    String str3 = this.f6736c;
                    String strC = m1Var.c();
                    if (str3 != null ? str3.equals(strC) : strC == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6734a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6735b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6736c;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f6734a + ", playIntegrityToken=" + this.f6735b + ", recaptchaEnterpriseToken=" + this.f6736c + "}";
    }
}
