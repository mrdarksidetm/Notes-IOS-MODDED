package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.j;
import ae.r;
import ae.s;
import android.os.LocaleList;
import androidx.compose.ui.e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l1.j0;
import l1.l0;
import md.i0;
import md.x;
import nd.q0;
import nd.r0;
import nd.t;
import nd.u;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LoadedPaywallComponentsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents(this.$state, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06221 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06221(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents_Preview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v16 ??, still in use, count: 1, list:
          (r7v16 ?? I:java.lang.Object) from 0x00fb: INVOKE (r4v1 ?? I:t0.l), (r7v16 ?? I:java.lang.Object) INTERFACE call: t0.l.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void LoadedPaywallComponents(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v16 ??, still in use, count: 1, list:
          (r7v16 ?? I:java.lang.Object) from 0x00fb: INVOKE (r4v1 ?? I:t0.l), (r7v16 ?? I:java.lang.Object) INTERFACE call: t0.l.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywallComponents_Preview(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-1173704376);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-1173704376, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_Preview (LoadedPaywallComponents.kt:112)");
            }
            Offering offering = new Offering("id", b.f7429c, r0.e(), u.m(), null);
            URL url = new URL("https://assets.pawwalls.com");
            String strM62constructorimpl = LocalizationKey.m62constructorimpl("hello-world");
            j0.a aVar = j0.f14524b;
            String str = null;
            HorizontalAlignment horizontalAlignment = null;
            Size size = null;
            Padding padding = null;
            Padding padding2 = null;
            ComponentOverrides componentOverrides = null;
            j jVar = null;
            List listD = t.d(new TextComponent(strM62constructorimpl, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null), (ColorScheme) null, str, (FontWeight) null, (FontSize) null, horizontalAlignment, size, padding, padding2, componentOverrides, 2044, jVar));
            HorizontalAlignment horizontalAlignment2 = HorizontalAlignment.CENTER;
            FlexDistribution flexDistribution = FlexDistribution.START;
            lVar2 = lVarP;
            LoadedPaywallComponents(new PaywallState.Loaded.Components(offering, new PaywallComponentsData("template", url, new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(listD, new Dimension.Vertical(horizontalAlignment2, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.c())), (ColorInfo) null, 2, (j) null), (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (ComponentOverrides) null, 2028, (j) null), new Background.Color(new ColorScheme(new ColorInfo.Hex(l0.i(aVar.b())), new ColorInfo.Hex(l0.i(aVar.h())))), new StickyFooterComponent(new StackComponent(t.d(new TextComponent(LocalizationKey.m62constructorimpl("hello-world"), new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null), (ColorScheme) null, str, (FontWeight) null, (FontSize) null, horizontalAlignment, size, padding, padding2, componentOverrides, 2044, jVar)), new Dimension.Vertical(horizontalAlignment2, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.k())), (ColorInfo) null, 2, (j) null), (Padding) null, (Padding) null, new Shape.Rectangle(new CornerRadiuses(10.0d, 10.0d, 0.0d, 0.0d)), (Border) null, new Shadow(new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), new ColorInfo.Hex(l0.i(aVar.l()))), 10.0d, 0.0d, -5.0d), (ComponentOverrides) null, 1388, (j) null)))), q0.c(x.a(LocaleId.m34boximpl(LocaleId.m35constructorimpl("en_US")), q0.c(x.a(LocalizationKey.m61boximpl(LocalizationKey.m62constructorimpl("hello-world")), LocalizationData.Text.m52boximpl(LocalizationData.Text.m53constructorimpl("Hello, world!")))))), LocaleId.m35constructorimpl("en_US"), 0, 32, (j) null)), androidx.compose.foundation.layout.p.e(e.f2662a, 0.0f, 1, null), lVar2, 56, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06221(i10));
    }

    private static final List<LocaleId> mapToLocaleIds(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(localeList.size());
        int size = localeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = localeList.get(i10);
            if (locale != null) {
                arrayList.add(LocaleId.m34boximpl(toLocaleId(locale)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: toLocale-_KYeFs0, reason: not valid java name */
    private static final Locale m85toLocale_KYeFs0(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        r.e(localeForLanguageTag, "forLanguageTag(value)");
        return localeForLanguageTag;
    }

    private static final String toLocaleId(Locale locale) {
        String languageTag = locale.toLanguageTag();
        r.e(languageTag, "toLanguageTag()");
        return LocaleId.m35constructorimpl(languageTag);
    }
}
