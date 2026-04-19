package wa;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.mlkit_common.zzas;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    private static final zzat A;
    private static final zzat B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.d[] f22699a = new t8.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.d f22700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t8.d f22701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t8.d f22702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t8.d f22703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t8.d f22704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t8.d f22705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t8.d f22706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t8.d f22707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t8.d f22708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t8.d f22709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t8.d f22710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t8.d f22711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t8.d f22712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t8.d f22713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t8.d f22714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t8.d f22715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t8.d f22716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t8.d f22717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t8.d f22718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t8.d f22719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t8.d f22720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t8.d f22721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t8.d f22722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t8.d f22723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t8.d f22724z;

    static {
        t8.d dVar = new t8.d("vision.barcode", 1L);
        f22700b = dVar;
        t8.d dVar2 = new t8.d("vision.custom.ica", 1L);
        f22701c = dVar2;
        t8.d dVar3 = new t8.d("vision.face", 1L);
        f22702d = dVar3;
        t8.d dVar4 = new t8.d("vision.ica", 1L);
        f22703e = dVar4;
        t8.d dVar5 = new t8.d("vision.ocr", 1L);
        f22704f = dVar5;
        f22705g = new t8.d("mlkit.ocr.chinese", 1L);
        f22706h = new t8.d("mlkit.ocr.common", 1L);
        f22707i = new t8.d("mlkit.ocr.devanagari", 1L);
        f22708j = new t8.d("mlkit.ocr.japanese", 1L);
        f22709k = new t8.d("mlkit.ocr.korean", 1L);
        t8.d dVar6 = new t8.d("mlkit.langid", 1L);
        f22710l = dVar6;
        t8.d dVar7 = new t8.d("mlkit.nlclassifier", 1L);
        f22711m = dVar7;
        t8.d dVar8 = new t8.d("tflite_dynamite", 1L);
        f22712n = dVar8;
        t8.d dVar9 = new t8.d("mlkit.barcode.ui", 1L);
        f22713o = dVar9;
        t8.d dVar10 = new t8.d("mlkit.smartreply", 1L);
        f22714p = dVar10;
        f22715q = new t8.d("mlkit.image.caption", 1L);
        f22716r = new t8.d("mlkit.docscan.detect", 1L);
        f22717s = new t8.d("mlkit.docscan.crop", 1L);
        f22718t = new t8.d("mlkit.docscan.enhance", 1L);
        f22719u = new t8.d("mlkit.docscan.ui", 1L);
        f22720v = new t8.d("mlkit.docscan.stain", 1L);
        f22721w = new t8.d("mlkit.docscan.shadow", 1L);
        f22722x = new t8.d("mlkit.quality.aesthetic", 1L);
        f22723y = new t8.d("mlkit.quality.technical", 1L);
        f22724z = new t8.d("mlkit.segmentation.subject", 1L);
        zzas zzasVar = new zzas();
        zzasVar.zza("barcode", dVar);
        zzasVar.zza("custom_ica", dVar2);
        zzasVar.zza("face", dVar3);
        zzasVar.zza("ica", dVar4);
        zzasVar.zza("ocr", dVar5);
        zzasVar.zza("langid", dVar6);
        zzasVar.zza("nlclassifier", dVar7);
        zzasVar.zza("tflite_dynamite", dVar8);
        zzasVar.zza("barcode_ui", dVar9);
        zzasVar.zza("smart_reply", dVar10);
        A = zzasVar.zzb();
        zzas zzasVar2 = new zzas();
        zzasVar2.zza("com.google.android.gms.vision.barcode", dVar);
        zzasVar2.zza("com.google.android.gms.vision.custom.ica", dVar2);
        zzasVar2.zza("com.google.android.gms.vision.face", dVar3);
        zzasVar2.zza("com.google.android.gms.vision.ica", dVar4);
        zzasVar2.zza("com.google.android.gms.vision.ocr", dVar5);
        zzasVar2.zza("com.google.android.gms.mlkit.langid", dVar6);
        zzasVar2.zza("com.google.android.gms.mlkit.nlclassifier", dVar7);
        zzasVar2.zza("com.google.android.gms.tflite_dynamite", dVar8);
        zzasVar2.zza("com.google.android.gms.mlkit_smartreply", dVar10);
        B = zzasVar2.zzb();
    }

    public static void a(Context context, final t8.d[] dVarArr) {
        a9.c.a(context).a(a9.f.d().a(new u8.b() { // from class: wa.t
            @Override // u8.b
            public final t8.d[] a() {
                t8.d[] dVarArr2 = i.f22699a;
                return dVarArr;
            }
        }).b()).addOnFailureListener(new OnFailureListener() { // from class: wa.u
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }
}
