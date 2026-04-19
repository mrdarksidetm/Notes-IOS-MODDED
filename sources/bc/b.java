package bc;

import ae.r;
import ae.s;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.v;
import je.w;
import md.l;
import md.n;
import nd.c0;
import nd.u;
import xd.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f5700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f5701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f5702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f5703e;

    static final class a extends s implements zd.a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5704a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            return 33554432;
        }
    }

    /* JADX INFO: renamed from: bc.b$b, reason: collision with other inner class name */
    static final class C0136b extends s implements zd.a<String> {
        C0136b() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            return b.this.e().getPackageName() + ".flutter.share_provider";
        }
    }

    public b(Context context, Activity activity, dev.fluttercommunity.plus.share.a aVar) {
        r.f(context, "context");
        r.f(aVar, "manager");
        this.f5699a = context;
        this.f5700b = activity;
        this.f5701c = aVar;
        this.f5702d = n.b(new C0136b());
        this.f5703e = n.b(a.f5704a);
    }

    private final void b() {
        File fileI = i();
        File[] fileArrListFiles = fileI.listFiles();
        if (fileI.exists()) {
            boolean z10 = true;
            if (fileArrListFiles != null) {
                if (!(fileArrListFiles.length == 0)) {
                    z10 = false;
                }
            }
            if (z10) {
                return;
            }
            r.c(fileArrListFiles);
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileI.delete();
        }
    }

    private final File c(File file) {
        File fileI = i();
        if (!fileI.exists()) {
            fileI.mkdirs();
        }
        File file2 = new File(fileI, file.getName());
        k.h(file, file2, true, 0, 4, null);
        return file2;
    }

    private final boolean d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            r.c(canonicalPath);
            String canonicalPath2 = i().getCanonicalPath();
            r.e(canonicalPath2, "getCanonicalPath(...)");
            return v.G(canonicalPath, canonicalPath2, false, 2, null);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context e() {
        Activity activity = this.f5700b;
        if (activity == null) {
            return this.f5699a;
        }
        r.c(activity);
        return activity;
    }

    private final int f() {
        return ((Number) this.f5703e.getValue()).intValue();
    }

    private final String g(String str) {
        if (str == null || !w.L(str, "/", false, 2, null)) {
            return "*";
        }
        String strSubstring = str.substring(0, w.Y(str, "/", 0, false, 6, null));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String h() {
        return (String) this.f5702d.getValue();
    }

    private final File i() {
        return new File(e().getCacheDir(), "share_plus");
    }

    private final ArrayList<Uri> j(List<String> list) throws IOException {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (d(file)) {
                throw new IOException("Shared file can not be located in '" + i().getCanonicalPath() + "'");
            }
            arrayList.add(androidx.core.content.b.getUriForFile(e(), h(), c(file)));
        }
        return arrayList;
    }

    private final String k(List<String> list) {
        boolean z10 = false;
        int i10 = 1;
        if (list != null && !list.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            return "*/*";
        }
        if (list.size() == 1) {
            return (String) c0.Y(list);
        }
        String str = (String) c0.Y(list);
        int iO = u.o(list);
        if (1 <= iO) {
            while (true) {
                if (!r.b(str, list.get(i10))) {
                    if (!r.b(g(str), g(list.get(i10)))) {
                        return "*/*";
                    }
                    str = g(list.get(i10)) + "/*";
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return str;
    }

    private final void o(Intent intent, boolean z10) {
        Activity activity = this.f5700b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f5701c.d();
            }
            this.f5699a.startActivity(intent);
            return;
        }
        r.c(activity);
        if (z10) {
            activity.startActivityForResult(intent, 22643);
        } else {
            activity.startActivity(intent);
        }
    }

    public final void l(Activity activity) {
        this.f5700b = activity;
    }

    public final void m(String str, String str2, boolean z10) {
        r.f(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        Intent intentCreateChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f5699a, 0, new Intent(this.f5699a, (Class<?>) SharePlusPendingIntent.class), 134217728 | f()).getIntentSender()) : Intent.createChooser(intent, null);
        r.c(intentCreateChooser);
        o(intentCreateChooser, z10);
    }

    public final void n(List<String> list, List<String> list2, String str, String str2, boolean z10) throws IOException {
        r.f(list, "paths");
        b();
        ArrayList<Uri> arrayListJ = j(list);
        Intent intent = new Intent();
        if (arrayListJ.isEmpty()) {
            if (!(str == null || v.v(str))) {
                m(str, str2, z10);
                return;
            }
        }
        if (arrayListJ.size() == 1) {
            String str3 = !(list2 == null || list2.isEmpty()) ? (String) c0.Y(list2) : "*/*";
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) c0.Y(arrayListJ));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(k(list2));
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListJ);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        Intent intentCreateChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f5699a, 0, new Intent(this.f5699a, (Class<?>) SharePlusPendingIntent.class), 134217728 | f()).getIntentSender()) : Intent.createChooser(intent, null);
        List<ResolveInfo> listQueryIntentActivities = e().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
        r.e(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str4 = ((ResolveInfo) it.next()).activityInfo.packageName;
            Iterator<T> it2 = arrayListJ.iterator();
            while (it2.hasNext()) {
                e().grantUriPermission(str4, (Uri) it2.next(), 3);
            }
        }
        r.c(intentCreateChooser);
        o(intentCreateChooser, z10);
    }
}
