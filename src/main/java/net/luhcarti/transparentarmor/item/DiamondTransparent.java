package net.luhcarti.transparentarmor.item;

import net.luhcarti.transparentarmor.TransparentArmor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum DiamondTransparent implements ArmorMaterial {
    TRANSPARENT_DIAMOND("transparent_diamond", new int[]{3, 8, 6, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2f, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    private static final int[] HEALTH_PER_SLOT = new int[]{429, 495, 528, 363};
    private final String name;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    DiamondTransparent(String p_40474_, int[] p_40476_, int p_40477_,
                       SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    DiamondTransparent(String ironTransparent, int i, int[] ints, int i1, SoundEvent armorEquipGold, float v, float v1, Object o, String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, LazyLoadedValue<Ingredient> repairIngredient) {

        this.name = name;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()];
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.DIAMOND);
    }

    public String getName() {
        return TransparentArmor.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}