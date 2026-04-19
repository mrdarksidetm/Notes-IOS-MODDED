package i;

import ae.j;
import ae.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import h.i;
import i.a;
import md.q;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public class d extends i.a<i, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12034a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final ResolveInfo a(Context context) {
            r.f(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            r.f(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(f fVar) {
            r.f(fVar, "input");
            if (fVar instanceof c) {
                return "image/*";
            }
            if (fVar instanceof e) {
                return "video/*";
            }
            if (fVar instanceof C0293d) {
                return ((C0293d) fVar).a();
            }
            if (fVar instanceof b) {
                return null;
            }
            throw new q();
        }

        public final boolean d(Context context) {
            r.f(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            r.f(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        }
    }

    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12035a = new b();

        private b() {
        }
    }

    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12036a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: i.d$d, reason: collision with other inner class name */
    public static final class C0293d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12037a;

        public final String a() {
            return this.f12037a;
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f12038a = new e();

        private e() {
        }
    }

    public interface f {
    }

    public static final boolean c() {
        return f12034a.f();
    }

    @Override // i.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, i iVar) {
        ActivityInfo activityInfo;
        Intent intent;
        r.f(context, "context");
        r.f(iVar, "input");
        a aVar = f12034a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(iVar.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo resolveInfoB = aVar.b(context);
            if (resolveInfoB == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = resolveInfoB.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else {
            if (!aVar.d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.c(iVar.a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoA = aVar.a(context);
            if (resolveInfoA == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = resolveInfoA.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.c(iVar.a()));
        return intent;
    }

    @Override // i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.C0292a<Uri> getSynchronousResult(Context context, i iVar) {
        r.f(context, "context");
        r.f(iVar, "input");
        return null;
    }

    @Override // i.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Uri parseResult(int i10, Intent intent) {
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) c0.a0(i.b.f12031a.a(intent));
        }
        return data;
    }
}
