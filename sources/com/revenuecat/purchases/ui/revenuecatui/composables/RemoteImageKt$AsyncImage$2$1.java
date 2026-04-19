package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import md.i0;
import md.q;
import z5.b;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class RemoteImageKt$AsyncImage$2$1 extends s implements l<b.c.C0495b, i0> {
    final /* synthetic */ l<b.c.C0495b, i0> $onError;
    final /* synthetic */ ImageSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RemoteImageKt$AsyncImage$2$1(ImageSource imageSource, l<? super b.c.C0495b, i0> lVar) {
        super(1);
        this.$source = imageSource;
        this.$onError = lVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(b.c.C0495b c0495b) {
        invoke2(c0495b);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b.c.C0495b c0495b) {
        StringBuilder sb2;
        r.f(c0495b, "it");
        ImageSource imageSource = this.$source;
        if (imageSource instanceof ImageSource.Local) {
            sb2 = new StringBuilder();
            sb2.append("Error loading local image: '");
            sb2.append(((ImageSource.Local) this.$source).getResource());
        } else {
            if (!(imageSource instanceof ImageSource.Remote)) {
                throw new q();
            }
            sb2 = new StringBuilder();
            sb2.append("Error loading image from '");
            sb2.append(((ImageSource.Remote) this.$source).getUrlString());
        }
        sb2.append('\'');
        Logger.INSTANCE.e(sb2.toString(), c0495b.d().c());
        l<b.c.C0495b, i0> lVar = this.$onError;
        if (lVar != null) {
            lVar.invoke(c0495b);
        }
    }
}
