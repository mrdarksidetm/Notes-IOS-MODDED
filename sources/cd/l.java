package cd;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import cd.c;
import cd.q;
import h.i;
import i.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class l implements sc.l, sc.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f6827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f6828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f6829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cd.c f6830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f6831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f6832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cd.b f6833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f6834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f6835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f6836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f6837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f6838l;

    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f6839a;

        a(Activity activity) {
            this.f6839a = activity;
        }

        @Override // cd.l.h
        public void a(String str, int i10) {
            androidx.core.app.a.g(this.f6839a, new String[]{str}, i10);
        }

        @Override // cd.l.h
        public boolean b() {
            return o.e(this.f6839a);
        }

        @Override // cd.l.h
        public boolean c(String str) {
            return androidx.core.content.a.checkSelfPermission(this.f6839a, str) == 0;
        }
    }

    class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f6840a;

        b(Activity activity) {
            this.f6840a = activity;
        }

        @Override // cd.l.d
        public Uri a(String str, File file) {
            return androidx.core.content.b.getUriForFile(this.f6840a, str, file);
        }

        @Override // cd.l.d
        public void b(Uri uri, final f fVar) {
            Activity activity = this.f6840a;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: cd.m
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    fVar.a(str);
                }
            });
        }
    }

    public enum c {
        REAR,
        FRONT
    }

    interface d {
        Uri a(String str, File file);

        void b(Uri uri, f fVar);
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f6844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f6845b;

        public e(String str, String str2) {
            this.f6844a = str;
            this.f6845b = str2;
        }
    }

    interface f {
        void a(String str);
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q.g f6847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q.n f6848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q.j<List<String>> f6849c;

        g(q.g gVar, q.n nVar, q.j<List<String>> jVar) {
            this.f6847a = gVar;
            this.f6848b = nVar;
            this.f6849c = jVar;
        }
    }

    interface h {
        void a(String str, int i10);

        boolean b();

        boolean c(String str);
    }

    public l(Activity activity, p pVar, cd.c cVar) {
        this(activity, pVar, null, null, null, cVar, new a(activity), new b(activity), new cd.b(), Executors.newSingleThreadExecutor());
    }

    l(Activity activity, p pVar, q.g gVar, q.n nVar, q.j<List<String>> jVar, cd.c cVar, h hVar, d dVar, cd.b bVar, ExecutorService executorService) {
        this.f6838l = new Object();
        this.f6828b = activity;
        this.f6829c = pVar;
        this.f6827a = activity.getPackageName() + ".flutter.image_provider";
        if (jVar != null) {
            this.f6837k = new g(gVar, nVar, jVar);
        }
        this.f6831e = hVar;
        this.f6832f = dVar;
        this.f6833g = bVar;
        this.f6830d = cVar;
        this.f6834h = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void J(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t(null);
            return;
        }
        ArrayList<e> arrayListU = u(intent, true);
        if (arrayListU == null) {
            r("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            E(arrayListU);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void H(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t(null);
            return;
        }
        ArrayList<e> arrayListU = u(intent, false);
        if (arrayListU == null) {
            r("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            E(arrayListU);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void K(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t(null);
            return;
        }
        ArrayList<e> arrayListU = u(intent, false);
        if (arrayListU == null || arrayListU.size() < 1) {
            r("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            t(arrayListU.get(0).f6844a);
        }
    }

    private void E(ArrayList<e> arrayList) {
        q.g gVar;
        synchronized (this.f6838l) {
            g gVar2 = this.f6837k;
            gVar = gVar2 != null ? gVar2.f6847a : null;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i10 = 0;
        if (gVar != null) {
            while (i10 < arrayList.size()) {
                e eVar = arrayList.get(i10);
                String strV = eVar.f6844a;
                String str = eVar.f6845b;
                if (str == null || !str.startsWith("video/")) {
                    strV = v(eVar.f6844a, gVar);
                }
                arrayList2.add(strV);
                i10++;
            }
        } else {
            while (i10 < arrayList.size()) {
                arrayList2.add(arrayList.get(i10).f6844a);
                i10++;
            }
        }
        s(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(String str) {
        D(str, true);
    }

    private void M(Boolean bool, int i10) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new i.c(i10).createIntent(this.f6828b, new i.a().b(d.c.f12036a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.f6828b.startActivityForResult(intent, 2346);
    }

    private void N(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new i.d().createIntent(this.f6828b, new i.a().b(d.c.f12036a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.f6828b.startActivityForResult(intent, 2342);
    }

    private void O(q.e eVar) {
        Intent intentCreateIntent;
        if (eVar.d().booleanValue()) {
            intentCreateIntent = eVar.b().booleanValue() ? new i.c(o.a(eVar)).createIntent(this.f6828b, new i.a().b(d.b.f12035a).a()) : new i.d().createIntent(this.f6828b, new i.a().b(d.b.f12035a).a());
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", eVar.b());
            intentCreateIntent = intent;
        }
        this.f6828b.startActivityForResult(intentCreateIntent, 2347);
    }

    private void P(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new i.d().createIntent(this.f6828b, new i.a().b(d.e.f12038a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.f6828b.startActivityForResult(intent, 2352);
    }

    private void Q() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f6835i == c.FRONT) {
            a0(intent);
        }
        File fileO = o();
        this.f6836j = Uri.parse("file:" + fileO.getAbsolutePath());
        Uri uriA = this.f6832f.a(this.f6827a, fileO);
        intent.putExtra("output", uriA);
        w(intent, uriA);
        try {
            try {
                this.f6828b.startActivityForResult(intent, 2343);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                r("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            fileO.delete();
            r("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void R() {
        q.n nVar;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f6838l) {
            g gVar = this.f6837k;
            nVar = gVar != null ? gVar.f6848b : null;
        }
        if (nVar != null && nVar.b() != null) {
            intent.putExtra("android.intent.extra.durationLimit", nVar.b().intValue());
        }
        if (this.f6835i == c.FRONT) {
            a0(intent);
        }
        File fileP = p();
        this.f6836j = Uri.parse("file:" + fileP.getAbsolutePath());
        Uri uriA = this.f6832f.a(this.f6827a, fileP);
        intent.putExtra("output", uriA);
        w(intent, uriA);
        try {
            try {
                this.f6828b.startActivityForResult(intent, 2353);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                r("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            fileP.delete();
            r("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean S() {
        h hVar = this.f6831e;
        if (hVar == null) {
            return false;
        }
        return hVar.b();
    }

    private static List<ResolveInfo> T(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    private boolean X(q.g gVar, q.n nVar, q.j<List<String>> jVar) {
        synchronized (this.f6838l) {
            if (this.f6837k != null) {
                return false;
            }
            this.f6837k = new g(gVar, nVar, jVar);
            this.f6830d.a();
            return true;
        }
    }

    private void a0(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    private File n(String str) {
        String string = UUID.randomUUID().toString();
        File cacheDir = this.f6828b.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(string, str, cacheDir);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File o() {
        return n(".jpg");
    }

    private File p() {
        return n(".mp4");
    }

    private void q(q.j<List<String>> jVar) {
        jVar.a(new q.d("already_active", "Image picker is already active", null));
    }

    private void r(String str, String str2) {
        q.j<List<String>> jVar;
        synchronized (this.f6838l) {
            g gVar = this.f6837k;
            jVar = gVar != null ? gVar.f6849c : null;
            this.f6837k = null;
        }
        if (jVar == null) {
            this.f6830d.f(null, str, str2);
        } else {
            jVar.a(new q.d(str, str2, null));
        }
    }

    private void s(ArrayList<String> arrayList) {
        q.j<List<String>> jVar;
        synchronized (this.f6838l) {
            g gVar = this.f6837k;
            jVar = gVar != null ? gVar.f6849c : null;
            this.f6837k = null;
        }
        if (jVar == null) {
            this.f6830d.f(arrayList, null, null);
        } else {
            jVar.success(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        q.j<List<String>> jVar;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f6838l) {
            g gVar = this.f6837k;
            jVar = gVar != null ? gVar.f6849c : null;
            this.f6837k = null;
        }
        if (jVar != null) {
            jVar.success(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f6830d.f(arrayList, null, null);
        }
    }

    private ArrayList<e> u(Intent intent, boolean z10) {
        String strE;
        ArrayList<e> arrayList = new ArrayList<>();
        Uri data = intent.getData();
        if (data != null) {
            String strE2 = this.f6833g.e(this.f6828b, data);
            if (strE2 == null) {
                return null;
            }
            arrayList.add(new e(strE2, null));
        } else {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i10 = 0; i10 < intent.getClipData().getItemCount(); i10++) {
                Uri uri = intent.getClipData().getItemAt(i10).getUri();
                if (uri == null || (strE = this.f6833g.e(this.f6828b, uri)) == null) {
                    return null;
                }
                arrayList.add(new e(strE, z10 ? this.f6828b.getContentResolver().getType(uri) : null));
            }
        }
        return arrayList;
    }

    private String v(String str, q.g gVar) {
        return this.f6829c.j(str, gVar.c(), gVar.b(), gVar.d().intValue());
    }

    private void w(Intent intent, Uri uri) {
        PackageManager packageManager = this.f6828b.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : T(packageManager, intent)).iterator();
        while (it.hasNext()) {
            this.f6828b.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void I(int i10) {
        if (i10 != -1) {
            t(null);
            return;
        }
        Uri uri = this.f6836j;
        d dVar = this.f6832f;
        if (uri == null) {
            uri = Uri.parse(this.f6830d.c());
        }
        dVar.b(uri, new f() { // from class: cd.j
            @Override // cd.l.f
            public final void a(String str) {
                this.f6825a.F(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void L(int i10) {
        if (i10 != -1) {
            t(null);
            return;
        }
        Uri uri = this.f6836j;
        d dVar = this.f6832f;
        if (uri == null) {
            uri = Uri.parse(this.f6830d.c());
        }
        dVar.b(uri, new f() { // from class: cd.k
            @Override // cd.l.f
            public final void a(String str) {
                this.f6826a.t(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void G(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t(null);
            return;
        }
        ArrayList<e> arrayListU = u(intent, false);
        if (arrayListU == null) {
            r("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            E(arrayListU);
        }
    }

    void D(String str, boolean z10) {
        q.g gVar;
        synchronized (this.f6838l) {
            g gVar2 = this.f6837k;
            gVar = gVar2 != null ? gVar2.f6847a : null;
        }
        if (gVar == null) {
            t(str);
            return;
        }
        String strV = v(str, gVar);
        if (strV != null && !strV.equals(str) && z10) {
            new File(str).delete();
        }
        t(strV);
    }

    q.b U() {
        Map<String, Object> mapB = this.f6830d.b();
        if (mapB.isEmpty()) {
            return null;
        }
        q.b.a aVar = new q.b.a();
        q.c cVar = (q.c) mapB.get("type");
        if (cVar != null) {
            aVar.d(cVar);
        }
        aVar.b((q.a) mapB.get("error"));
        ArrayList<String> arrayList = (ArrayList) mapB.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                Double d10 = (Double) mapB.get("maxWidth");
                Double d11 = (Double) mapB.get("maxHeight");
                Integer num = (Integer) mapB.get("imageQuality");
                arrayList2.add(this.f6829c.j(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            aVar.c(arrayList2);
        }
        this.f6830d.a();
        return aVar.a();
    }

    void V() {
        synchronized (this.f6838l) {
            g gVar = this.f6837k;
            if (gVar == null) {
                return;
            }
            q.g gVar2 = gVar.f6847a;
            this.f6830d.g(gVar2 != null ? c.b.IMAGE : c.b.VIDEO);
            if (gVar2 != null) {
                this.f6830d.d(gVar2);
            }
            Uri uri = this.f6836j;
            if (uri != null) {
                this.f6830d.e(uri);
            }
        }
    }

    void W(c cVar) {
        this.f6835i = cVar;
    }

    public void Y(q.g gVar, q.j<List<String>> jVar) {
        if (!X(gVar, null, jVar)) {
            q(jVar);
        } else if (!S() || this.f6831e.c("android.permission.CAMERA")) {
            Q();
        } else {
            this.f6831e.a("android.permission.CAMERA", 2345);
        }
    }

    public void Z(q.n nVar, q.j<List<String>> jVar) {
        if (!X(null, nVar, jVar)) {
            q(jVar);
        } else if (!S() || this.f6831e.c("android.permission.CAMERA")) {
            R();
        } else {
            this.f6831e.a("android.permission.CAMERA", 2355);
        }
    }

    @Override // sc.n
    public boolean d(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != 2345) {
            if (i10 != 2355) {
                return false;
            }
            if (z10) {
                R();
            }
        } else if (z10) {
            Q();
        }
        if (!z10 && (i10 == 2345 || i10 == 2355)) {
            r("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    public void j(q.g gVar, boolean z10, q.j<List<String>> jVar) {
        if (X(gVar, null, jVar)) {
            N(Boolean.valueOf(z10));
        } else {
            q(jVar);
        }
    }

    public void k(q.h hVar, q.e eVar, q.j<List<String>> jVar) {
        if (X(hVar.b(), null, jVar)) {
            O(eVar);
        } else {
            q(jVar);
        }
    }

    public void l(q.g gVar, boolean z10, int i10, q.j<List<String>> jVar) {
        if (X(gVar, null, jVar)) {
            M(Boolean.valueOf(z10), i10);
        } else {
            q(jVar);
        }
    }

    public void m(q.n nVar, boolean z10, q.j<List<String>> jVar) {
        if (X(null, nVar, jVar)) {
            P(Boolean.valueOf(z10));
        } else {
            q(jVar);
        }
    }

    @Override // sc.l
    public boolean onActivityResult(int i10, final int i11, final Intent intent) {
        Runnable runnable;
        if (i10 == 2342) {
            runnable = new Runnable() { // from class: cd.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6809a.G(i11, intent);
                }
            };
        } else if (i10 == 2343) {
            runnable = new Runnable() { // from class: cd.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6815a.I(i11);
                }
            };
        } else if (i10 == 2346) {
            runnable = new Runnable() { // from class: cd.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6812a.H(i11, intent);
                }
            };
        } else if (i10 == 2347) {
            runnable = new Runnable() { // from class: cd.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6817a.J(i11, intent);
                }
            };
        } else if (i10 == 2352) {
            runnable = new Runnable() { // from class: cd.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6820a.K(i11, intent);
                }
            };
        } else {
            if (i10 != 2353) {
                return false;
            }
            runnable = new Runnable() { // from class: cd.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6823a.L(i11);
                }
            };
        }
        this.f6834h.execute(runnable);
        return true;
    }
}
