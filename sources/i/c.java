package i;

import ae.j;
import ae.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import h.i;
import i.a;
import i.d;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public class c extends i.a<i, List<Uri>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12032b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12033a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public c(int i10) {
        this.f12033a = i10;
        if (!(i10 > 1)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    @Override // i.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, i iVar) {
        r.f(context, "context");
        r.f(iVar, "input");
        d.a aVar = d.f12034a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(iVar.a()));
            if (!(this.f12033a <= MediaStore.getPickImagesMaxLimit())) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f12033a);
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo resolveInfoB = aVar.b(context);
            if (resolveInfoB == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = resolveInfoB.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(iVar.a()));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.f12033a);
            return intent2;
        }
        if (aVar.d(context)) {
            ResolveInfo resolveInfoA = aVar.a(context);
            if (resolveInfoA == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = resolveInfoA.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f12033a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.c(iVar.a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.C0292a<List<Uri>> getSynchronousResult(Context context, i iVar) {
        r.f(context, "context");
        r.f(iVar, "input");
        return null;
    }

    @Override // i.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List<Uri> parseResult(int i10, Intent intent) {
        List<Uri> listA;
        if (!(i10 == -1)) {
            intent = null;
        }
        return (intent == null || (listA = b.f12031a.a(intent)) == null) ? u.m() : listA;
    }
}
