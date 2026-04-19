package com.amazon.a.a.o.c.a;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f7501d = -6343169151696340687L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient boolean f7504f;

    d(String str, boolean z10) {
        this.f7503e = str;
        this.f7504f = z10;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object c() {
        return a(this.f7503e);
    }

    public int a(String str, int i10, String str2) {
        int length = str.length() - str2.length();
        if (length < i10) {
            return -1;
        }
        while (i10 <= length) {
            if (b(str, i10, str2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f7504f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public String a() {
        return this.f7503e;
    }

    public boolean b() {
        return this.f7504f;
    }

    public boolean b(String str, int i10, String str2) {
        return str.regionMatches(!this.f7504f, i10, str2, 0, str2.length());
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f7504f ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f7504f, 0, str2, 0, str2.length());
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f7504f, str.length() - length, str2, 0, length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7503e;
    }
}
