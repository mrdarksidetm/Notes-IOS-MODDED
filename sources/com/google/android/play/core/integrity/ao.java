package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f8753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8754c = null;

    /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f8752a = str;
        this.f8753b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f8753b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L2b
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f8752a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2b
            java.lang.Long r3 = r5.f8753b
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r3 != 0) goto L23
            if (r1 != 0) goto L2b
            goto L29
        L23:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2b
        L29:
            r1 = r0
            goto L2c
        L2b:
            r1 = r2
        L2c:
            boolean r3 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r3 == 0) goto L3f
            boolean r3 = a()
            if (r3 == 0) goto L3f
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L3d
            java.lang.Object r6 = r6.f8754c
            goto L40
        L3d:
            r0 = r2
            goto L40
        L3f:
            r0 = r1
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f8752a.hashCode() ^ 1000003;
        Long l10 = this.f8753b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f8752a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f8752a + ", cloudProjectNumber=" + this.f8753b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
