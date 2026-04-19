package ke;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
class f extends e {
    public static final d d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return d.f14472h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return d.f14471g;
        }
        if (c10 == 'M') {
            return d.f14470f;
        }
        if (c10 == 'S') {
            return d.f14469e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    public static final d e(String str) {
        r.f(str, "shortName");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return d.f14467c;
                                }
                            } else if (str.equals("ns")) {
                                return d.f14466b;
                            }
                        } else if (str.equals("ms")) {
                            return d.f14468d;
                        }
                    } else if (str.equals("s")) {
                        return d.f14469e;
                    }
                } else if (str.equals("m")) {
                    return d.f14470f;
                }
            } else if (str.equals("h")) {
                return d.f14471g;
            }
        } else if (str.equals("d")) {
            return d.f14472h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
