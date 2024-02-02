package me.basil.xraces.races

import me.basil.xraces.objects.Race
import me.basil.xraces.objects.RaceAttribute
import org.bukkit.Effect
import org.bukkit.Sound
import org.bukkit.attribute.Attribute
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class Vampire : Race(){
    override val name = "vampire"
    override val displayName = "Vampire"
    override val passives = listOf(PotionEffect(PotionEffectType.POISON, 999999, 255))
    override val dayPassives = listOf(PotionEffect(PotionEffectType.POISON, 999999, 255))
    override val nightPassives = listOf(PotionEffect(PotionEffectType.POISON, 999999, 255))
    override val permissions = listOf("")
    override val commands = listOf("")
    override val dayCommands = listOf("")
    override val nightCommands = listOf("")
    override val deathCommands = listOf("")
    override val respawnCommands = listOf("")
    override val attributes = listOf(RaceAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS))
    override val hurtSound = Sound.BLOCK_WATER_AMBIENT
    override val deathSound = Sound.BLOCK_WATER_AMBIENT
    override val teleportSound = Sound.BLOCK_WATER_AMBIENT
    override val teleportEffect = Effect.SMOKE
}