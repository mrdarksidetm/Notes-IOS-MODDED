package com.amazon.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f7186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f7187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7191i;

    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, false);
    }

    public c(String str, String str2, String str3, boolean z10, boolean z11) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z10, z11, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(new String[]{str}, str2, strArr, aVarArr, z10, z11, i10);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(strArr, str, strArr2, aVarArr, z10, z11, i10, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10, int i11) {
        String str2 = strArr[0];
        this.f7183a = str2;
        if (strArr.length > 1) {
            this.f7184b = strArr[1];
        } else {
            this.f7184b = str2;
        }
        this.f7185c = str;
        this.f7186d = strArr2;
        this.f7187e = aVarArr;
        this.f7188f = z10;
        this.f7189g = z11;
        this.f7190h = i10;
        this.f7191i = i11;
    }

    public String a() {
        return this.f7186d[this.f7190h];
    }

    public String[] b() {
        return this.f7186d;
    }

    public a[] c() {
        return this.f7187e;
    }

    public String d() {
        return this.f7185c;
    }

    public String e() {
        return this.f7184b;
    }

    public String f() {
        return this.f7183a;
    }

    public int g() {
        return this.f7191i;
    }

    public boolean h() {
        return this.f7188f;
    }

    public boolean i() {
        return this.f7189g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f7183a + ", message: " + this.f7185c + ", label: " + this.f7186d[0] + ", visible: " + this.f7188f + ", shouldShowFixup: " + this.f7189g + "]";
    }
}
