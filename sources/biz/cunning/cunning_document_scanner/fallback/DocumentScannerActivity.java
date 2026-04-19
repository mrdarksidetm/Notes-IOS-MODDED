package biz.cunning.cunning_document_scanner.fallback;

import ae.r;
import ae.s;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import biz.cunning.cunning_document_scanner.fallback.ui.ImageCropView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import nd.u;
import s5.g;
import s5.h;
import u5.f;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class DocumentScannerActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v5.a f5858d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageCropView f5861g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5855a = 24;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5856b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f5857c = 100.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<v5.a> f5859e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w5.b f5860f = new w5.b(this, new a(), new b());

    static final class a extends s implements l<String, i0> {
        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            r.f(str, "originalPhotoPath");
            if (DocumentScannerActivity.this.f5859e.size() == DocumentScannerActivity.this.f5855a - 1) {
                View viewFindViewById = DocumentScannerActivity.this.findViewById(g.f19984c);
                r.e(viewFindViewById, "findViewById(...)");
                ImageButton imageButton = (ImageButton) viewFindViewById;
                imageButton.setClickable(false);
                imageButton.setVisibility(4);
            }
            try {
                Bitmap bitmapE = new w5.d().e(str);
                if (bitmapE == null) {
                    DocumentScannerActivity.this.V("Document bitmap is null.");
                    return;
                }
                try {
                    List listW = DocumentScannerActivity.this.W(bitmapE);
                    v5.d dVar = new v5.d((v5.c) listW.get(0), (v5.c) listW.get(1), (v5.c) listW.get(3), (v5.c) listW.get(2));
                    DocumentScannerActivity.this.f5858d = new v5.a(str, bitmapE.getWidth(), bitmapE.getHeight(), dVar);
                    try {
                        ImageCropView imageCropView = DocumentScannerActivity.this.f5861g;
                        ImageCropView imageCropView2 = null;
                        if (imageCropView == null) {
                            r.t("imageView");
                            imageCropView = null;
                        }
                        imageCropView.e(bitmapE, u5.a.c(DocumentScannerActivity.this), u5.a.b(DocumentScannerActivity.this));
                        ImageCropView imageCropView3 = DocumentScannerActivity.this.f5861g;
                        if (imageCropView3 == null) {
                            r.t("imageView");
                            imageCropView3 = null;
                        }
                        imageCropView3.setImage(bitmapE);
                        ImageCropView imageCropView4 = DocumentScannerActivity.this.f5861g;
                        if (imageCropView4 == null) {
                            r.t("imageView");
                            imageCropView4 = null;
                        }
                        RectF imagePreviewBounds = imageCropView4.getImagePreviewBounds();
                        ImageCropView imageCropView5 = DocumentScannerActivity.this.f5861g;
                        if (imageCropView5 == null) {
                            r.t("imageView");
                            imageCropView5 = null;
                        }
                        v5.d dVarH = dVar.h(imagePreviewBounds, imageCropView5.getImagePreviewBounds().height() / bitmapE.getHeight());
                        ImageCropView imageCropView6 = DocumentScannerActivity.this.f5861g;
                        if (imageCropView6 == null) {
                            r.t("imageView");
                        } else {
                            imageCropView2 = imageCropView6;
                        }
                        imageCropView2.setCropper(dVarH);
                    } catch (Exception e10) {
                        DocumentScannerActivity.this.V("unable get image preview ready: " + e10.getMessage());
                    }
                } catch (Exception e11) {
                    DocumentScannerActivity.this.V("unable to get document corners: " + e11.getMessage());
                }
            } catch (Exception e12) {
                DocumentScannerActivity.this.V("Unable to get bitmap: " + e12.getLocalizedMessage());
            }
        }
    }

    static final class b extends s implements zd.a<i0> {
        b() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (DocumentScannerActivity.this.f5859e.isEmpty()) {
                DocumentScannerActivity.this.X();
            }
        }
    }

    static final class c extends s implements zd.a<i0> {
        c() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() throws IOException {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws IOException {
            DocumentScannerActivity.this.Z();
        }
    }

    static final class d extends s implements zd.a<i0> {
        d() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DocumentScannerActivity.this.Y();
        }
    }

    static final class e extends s implements zd.a<i0> {
        e() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() throws IOException {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws IOException {
            DocumentScannerActivity.this.a0();
        }
    }

    private final void T() {
        v5.a aVar = this.f5858d;
        if (aVar != null) {
            ImageCropView imageCropView = this.f5861g;
            ImageCropView imageCropView2 = null;
            if (imageCropView == null) {
                r.t("imageView");
                imageCropView = null;
            }
            v5.d corners = imageCropView.getCorners();
            ImageCropView imageCropView3 = this.f5861g;
            if (imageCropView3 == null) {
                r.t("imageView");
                imageCropView3 = null;
            }
            RectF imagePreviewBounds = imageCropView3.getImagePreviewBounds();
            ImageCropView imageCropView4 = this.f5861g;
            if (imageCropView4 == null) {
                r.t("imageView");
            } else {
                imageCropView2 = imageCropView4;
            }
            aVar.d(corners.i(imagePreviewBounds, imageCropView2.getImagePreviewBounds().height() / aVar.c()));
            this.f5859e.add(aVar);
        }
    }

    private final void U() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (v5.a aVar : this.f5859e) {
            int i11 = i10 + 1;
            try {
                Bitmap bitmapB = new w5.d().b(aVar.b(), aVar.a());
                if (bitmapB == null) {
                    V("Result of cropping is null");
                    return;
                }
                new File(aVar.b()).delete();
                try {
                    File fileA = new w5.c().a(this, i10);
                    u5.b.b(bitmapB, fileA, this.f5856b);
                    arrayList.add(Uri.fromFile(fileA).toString());
                } catch (Exception e10) {
                    V("unable to save cropped image: " + e10.getMessage());
                }
                i10 = i11;
            } catch (Exception e11) {
                V("unable to crop image: " + e11.getMessage());
                return;
            }
        }
        setResult(-1, new Intent().putExtra("croppedImageResults", arrayList));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String str) {
        setResult(-1, new Intent().putExtra("error", str));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<v5.c> W(Bitmap bitmap) {
        v5.c cVar = new v5.c(0.0d, 0.0d);
        double d10 = this.f5857c;
        v5.c cVar2 = new v5.c(bitmap.getWidth(), 0.0d);
        double d11 = this.f5857c;
        v5.c cVar3 = new v5.c(0.0d, bitmap.getHeight());
        double d12 = this.f5857c;
        v5.c cVar4 = new v5.c(bitmap.getWidth(), bitmap.getHeight());
        double d13 = this.f5857c;
        return u.p(f.c(cVar, d10, d10), f.c(cVar2, -d11, d11), f.c(cVar3, d12, -d12), f.c(cVar4, -d13, -d13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        T();
        U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() throws IOException {
        T();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() throws IOException {
        v5.a aVar = this.f5858d;
        if (aVar != null) {
            new File(aVar.b()).delete();
        }
        b0();
    }

    private final void b0() throws IOException {
        this.f5858d = null;
        this.f5860f.b(this.f5859e.size());
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        super.onCreate(bundle);
        setContentView(h.f19986a);
        View viewFindViewById = findViewById(g.f19983b);
        r.e(viewFindViewById, "findViewById(...)");
        this.f5861g = (ImageCropView) viewFindViewById;
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null && (obj2 = extras.get("maxNumDocuments")) != null) {
                if (je.u.l(obj2.toString()) == null) {
                    throw new Exception("maxNumDocuments must be a positive number");
                }
                this.f5855a = ((Integer) obj2).intValue();
            }
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null && (obj = extras2.get("croppedImageQuality")) != null) {
                if (!(obj instanceof Integer) || ((Number) obj).intValue() < 0 || ((Number) obj).intValue() > 100) {
                    throw new Exception("croppedImageQuality must be a number between 0 and 100");
                }
                this.f5856b = ((Number) obj).intValue();
            }
            View viewFindViewById2 = findViewById(g.f19984c);
            r.e(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = findViewById(g.f19982a);
            r.e(viewFindViewById3, "findViewById(...)");
            View viewFindViewById4 = findViewById(g.f19985d);
            r.e(viewFindViewById4, "findViewById(...)");
            u5.e.b((ImageButton) viewFindViewById2, new c());
            u5.e.b((ImageButton) viewFindViewById3, new d());
            u5.e.b((ImageButton) viewFindViewById4, new e());
            try {
                b0();
            } catch (Exception e10) {
                V("error opening camera: " + e10.getMessage());
            }
        } catch (Exception e11) {
            V("invalid extra: " + e11.getMessage());
        }
    }
}
