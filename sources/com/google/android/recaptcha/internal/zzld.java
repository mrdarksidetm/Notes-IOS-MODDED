package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzld {
    public static final zzld zza;
    public static final zzld zzb;
    public static final zzld zzc;
    public static final zzld zzd;
    public static final zzld zze;
    public static final zzld zzf;
    public static final zzld zzg;
    public static final zzld zzh;
    public static final zzld zzi;
    public static final zzld zzj;
    private static final /* synthetic */ zzld[] zzk;
    private final Class zzl;

    static {
        zzld zzldVar = new zzld("VOID", 0, Void.class, Void.class, null);
        zza = zzldVar;
        Class cls = Integer.TYPE;
        zzld zzldVar2 = new zzld("INT", 1, cls, Integer.class, 0);
        zzb = zzldVar2;
        zzld zzldVar3 = new zzld("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzldVar3;
        zzld zzldVar4 = new zzld("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzldVar4;
        zzld zzldVar5 = new zzld("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzldVar5;
        zzld zzldVar6 = new zzld("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzldVar6;
        zzld zzldVar7 = new zzld("STRING", 6, String.class, String.class, "");
        zzg = zzldVar7;
        zzld zzldVar8 = new zzld("BYTE_STRING", 7, zziv.class, zziv.class, zziv.zzb);
        zzh = zzldVar8;
        zzld zzldVar9 = new zzld("ENUM", 8, cls, Integer.class, null);
        zzi = zzldVar9;
        zzld zzldVar10 = new zzld("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzldVar10;
        zzk = new zzld[]{zzldVar, zzldVar2, zzldVar3, zzldVar4, zzldVar5, zzldVar6, zzldVar7, zzldVar8, zzldVar9, zzldVar10};
    }

    private zzld(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzld[] values() {
        return (zzld[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
