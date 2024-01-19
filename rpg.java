package OOP.dasar;

import java.util.Scanner;
import java.util.Random;

public class rpg {
    String char_name, shield, choice;
    int EnemyHP, HP, attack, defense, dodge, enemydmg, damage, speed, choice1, RNG;

    void play() {
        do {
            Scanner gg = new Scanner(System.in);
            Random random = new Random();
            System.out.println(char_name + " Is walking through the forest... suddenly...");
            System.out.println("An Ambushed!");
            System.out.println("Run or Attack?");
            choice = gg.next();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (choice.equalsIgnoreCase("attack")) {
                EnemyHP = random.nextInt(31) + 20; // Enemy HP 20-50
                do {
                    System.out.println("Your Health : " + HP);
                    System.out.println("Enemy's health: " + EnemyHP);
                    System.out.println("1. Attack");
                    System.out.println("2. Defend");
                    System.out.println("3. Dodge");
                    System.out.println("4. Inventory");
                    System.out.print("Action : ");
                    int choice1 = gg.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    switch (choice1) {
                        case 1:
                            damage = random.nextInt(15) + 5; // 5-20
                            EnemyHP -= damage;
                            System.out.println("You attacked! \nEnemy Lost " + damage + " Health!");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            enemydmg = random.nextInt(15) + 5;
                            HP -= enemydmg;
                            System.out.println("Enemy Attacked Back!\nYou lost " + enemydmg + " Health!");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            if (EnemyHP <= 0) {
                                System.out.println("You won!");
                            } else if (HP <= 0) {
                                System.out.println("You lost...");
                            }
                            break;

                        case 2:
                            boolean defense = random.nextBoolean();
                            enemydmg = random.nextInt(15) + 5;
                            System.out.println("You've use shield!\nEnemy attacked!");
                            if (defense == true) {
                                System.out.println("You deflect the attack with your shield!");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            } else {
                                HP -= enemydmg;
                                System.out.println("You failed to deflect! You lost " + enemydmg + " HP!");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            }
                            if (EnemyHP <= 0) {
                                System.out.println("You won!");
                            } else if (HP <= 0) {
                                System.out.println("You lost...");
                            }
                            break;

                        case 3:
                            dodge = random.nextInt(10) + 1;
                            if (dodge >= 6) {
                                damage = random.nextInt(15) + 5;
                                EnemyHP -= damage;
                                System.out
                                        .println("You've succesfully dodge and attack the enemy back!\nThe enemy lost "
                                                + EnemyHP + " HP!");
                            } else {
                                HP -= 1;
                                System.out.println(
                                        "You failed to dodge and was pushed back by the enemy...\nYou lost 1 HP...");
                            }
                            if (EnemyHP <= 0) {
                                System.out.println("You won!");
                            } else if (HP <= 0) {
                                System.out.println("You lost...");
                            }
                            break;

                        case 4:
                            System.out.println("You've opened up Inventory...");
                            System.out.println("1.Health Potions\n2.Defense Potion\n3.Speed Potions");
                            int choose = gg.nextInt();
                            switch (choose) {
                                case 1:
                                    HealthEffect();
                                    break;
                                case 2:
                                    DefenseEffect();
                                    break;

                                default:
                            }
                        default:
                    }
                } while (EnemyHP > 0 && HP > 0);
                break;
            } else if (choice.equalsIgnoreCase("run")) {
                int rng = random.nextInt(19) + 1; // 4-20 chance of escaping
                boolean eek = random.nextBoolean();
                if (rng >= 10 && rng <= 13) {
                    HP -= 10;
                    System.out.println(
                            "Enemy shot you from behind!\nYou but you managed to escape with " + HP + " HP Left!");
                } else if (eek == true) {
                    OngoingFighting();
                } else if (HP <= 0) {
                    System.out.println("You have died...");
                } else if (rng == 20) {
                    System.out.println("Succesfully Ran Away!");
                }
            }
            break;
        } while (EnemyHP > 0 || HP > 0);
    }

    void OngoingFighting() {
        Scanner gg = new Scanner(System.in);
        Random random = new Random();
        HP -= 10;
        EnemyHP = random.nextInt(31) + 20; // Enemy HP 20-50
        System.out.println("You failed to run! and lost 10 HP!");
        do {
            System.out.println("Your Health : " + HP);
            System.out.println("Enemy's health: " + EnemyHP);
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Dodge");
            System.out.println("4. Inventory");
            System.out.print("Action : ");
            int choice1 = gg.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (choice1) {
                case 1:
                    damage = random.nextInt(15) + 5; // 5-20
                    EnemyHP -= damage;
                    System.out.println("You attacked! \nEnemy Lost " + damage + " Health!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    enemydmg = random.nextInt(15) + 5;
                    HP -= enemydmg;
                    System.out.println("Enemy Attacked Back!\nYou lost " + enemydmg + " Health!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if (EnemyHP <= 0) {
                        System.out.println("You won!");
                    } else if (HP <= 0) {
                        System.out.println("You lost...");
                    }
                    break;

                case 2:
                    boolean defense = random.nextBoolean();
                    enemydmg = random.nextInt(11) + 5;
                    System.out.println("You've use shield!\nEnemy attacked!");
                    if (defense == true) {
                        System.out.println("You deflect the attack with your shield!");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    } else if (DefenseEffect() == true) {
                        defense = true;
                        System.out.println("You kept deflecting the attack!");
                    } else {
                        HP -= enemydmg;
                        System.out.println("You failed to deflect! You lost " + enemydmg + " HP!");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    if (EnemyHP <= 0) {
                        System.out.println("You won!");
                    } else if (HP <= 0) {
                        System.out.println("You lost...");
                    }
                    break;

                case 3:
                    dodge = random.nextInt(9) + 1;
                    if (dodge >= 6) {
                        damage = random.nextInt(15) + 5;
                        EnemyHP -= damage;
                        System.out.println("You've succesfully dodge and attack the enemy back!\nThe enemy lost "
                                + EnemyHP + " HP!");
                    } else {
                        HP -= 1;
                        System.out.println("You failed to dodge and was pushed back by the enemy...\nYou lost 1 HP...");
                    }
                    if (EnemyHP <= 0) {
                        System.out.println("You won!");
                    } else if (HP <= 0) {
                        System.out.println("You lost...");
                    }
                    break;

                case 4:
                    System.out.println("You opened up inventory.");
                    System.out.println("1. Health Potion\n2.Defense Potion\n3.Speed Potions");
                    int choose = gg.nextInt();
                    switch (choose) {
                        case 1:
                            HealthEffect();
                            break;
                        case 2:
                            DefenseEffect();
                            break;
                        default:
                    }
            }
        } while (EnemyHP > 0 || HP > 0);
    }

    void HealthEffect() {
        System.out.println("You've used health potions...");
        boolean HealthPotion = true;
        if (HealthPotion == true) {
            HP += 5;
        } else {
        }

    }

    boolean DefenseEffect() {
        System.out.println("You've used Defense Potions...");
        boolean DefensePotion = true;
        return DefensePotion;

    }
}

// While(EnemyHP > 0 && HP > 0) Supaya ketika salah satu false, game berakhir
// Jika memakai OR maka game tetap berlanjut meskipun salah satu false, Karena
// satunya masih true!