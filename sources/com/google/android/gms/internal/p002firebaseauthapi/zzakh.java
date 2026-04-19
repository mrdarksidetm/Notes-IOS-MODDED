package com.google.android.gms.internal.p002firebaseauthapi;

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
/* JADX INFO: loaded from: classes.dex */
public final class zzakh {
    public static final zzakh zza;
    public static final zzakh zzb;
    public static final zzakh zzc;
    public static final zzakh zzd;
    public static final zzakh zze;
    public static final zzakh zzf;
    public static final zzakh zzg;
    public static final zzakh zzh;
    public static final zzakh zzi;
    public static final zzakh zzj;
    private static final /* synthetic */ zzakh[] zzk;
    private final Class<?> zzl;

    static {
        zzakh zzakhVar = new zzakh("VOID", 0, Void.class, Void.class, null);
        zza = zzakhVar;
        Class cls = Integer.TYPE;
        zzakh zzakhVar2 = new zzakh("INT", 1, cls, Integer.class, 0);
        zzb = zzakhVar2;
        zzakh zzakhVar3 = new zzakh("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzakhVar3;
        zzakh zzakhVar4 = new zzakh("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzakhVar4;
        zzakh zzakhVar5 = new zzakh("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzakhVar5;
        zzakh zzakhVar6 = new zzakh("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzakhVar6;
        zzakh zzakhVar7 = new zzakh("STRING", 6, String.class, String.class, "");
        zzg = zzakhVar7;
        zzakh zzakhVar8 = new zzakh("BYTE_STRING", 7, zzaip.class, zzaip.class, zzaip.zza);
        zzh = zzakhVar8;
        zzakh zzakhVar9 = new zzakh("ENUM", 8, cls, Integer.class, null);
        zzi = zzakhVar9;
        zzakh zzakhVar10 = new zzakh("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzakhVar10;
        zzk = new zzakh[]{zzakhVar, zzakhVar2, zzakhVar3, zzakhVar4, zzakhVar5, zzakhVar6, zzakhVar7, zzakhVar8, zzakhVar9, zzakhVar10};
    }

    private zzakh(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzakh[] values() {
        return (zzakh[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
