package hw12.taxes;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class HW12Taxes {

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("***************************");
            System.out.println("         TAX CALC         *");
            System.out.println("1.- Income Tax            *");
            System.out.println("2.- VAT                   *");
            System.out.println("3.- ISD                   *");
            System.out.println("0.- EXIT                  *");
            System.out.println("***************************");

            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    float salary;
                    float salaryTotal = 0.0F;
                    float health;
                    float dress;
                    float food;
                    float education;
                    float home;
                    float sumDeductible = 0.0F;
                    float baseTax;
                    float totalTax = 0.0F;

                    System.out.println("ENTER YOUR SALARY");
                    salary = input.nextFloat();
                    salaryTotal = (float) ((salary * 12) - (salary * 0.0945));

                    System.out.println("ENTER YOUR DEDUCTIBLE");
                    System.out.println("ENTER YOUR TOTAL HEALTH DEDUCTIBLE ");
                    health = input.nextFloat();
                    System.out.println("ENTER YOUR TOTAL DRESS DEDUCTIBLE ");
                    dress = input.nextFloat();
                    System.out.println("ENTER YOUR TOTAL FOOD DEDUCTIBLE ");
                    food = input.nextFloat();
                    System.out.println("ENTER YOUR TOTAL EDUCATION,ART AND CULTURE DEDUCTIBLE ");
                    education = input.nextFloat();
                    System.out.println("ENTER YOUR TOTAL HOME DEDUCTIBLE ");
                    home = input.nextFloat();

                    sumDeductible = showDeductibleDress(dress)
                            + showDeductibleEducation(education) + showDeductibleFood(food) + showDeductibleHealth(health) + showDeductibleHome(home);
                    baseTax = salaryTotal - showDeductibleSum(home);
                    totalTax = computeFinalTax(baseTax, totalTax);

                    System.out.println("The total value of your Income Tax is $"
                            + computeFinalTax(baseTax, totalTax));
                    break;
                case 2:
                    float valueInit;
                    float TotalVATValue;
                    float FinalValue;

                    System.out.println("ENTER THE VALUE PRODUCT (NON-BASIC PRODUCT)");
                    valueInit = input.nextFloat();
                    TotalVATValue = (float) (valueInit * 0.12);
                    FinalValue = TotalVATValue + valueInit;
                    System.out.println("The VAT is $" + TotalVATValue);
                    System.out.println("The final product value is $" + FinalValue);
                    break;

                case 3:
                    float cash;
                    float FinalISD;

                    System.out.println("ENTER THE CASH VALUE WHICH YOU HAVE TO TRAVEL ABROAD");
                    cash = input.nextFloat();

                    if (cash >= 1200) {
                        FinalISD = (float) (cash * 0.05);
                        System.out.println("The ISD tax value is $" + FinalISD);
                    } else {
                        System.out.println("The tax is $0.00");

                    }
            }

        } while (option != 0);

    }

    public static float showDeductibleHealth(float health) {
        if (health > 14575.60) {
            return (float) 14575.60;
        } else {
            return health;
        }
    }

    public static float showDeductibleDress(float dress) {
        if (dress > 3643.90) {
            return (float) 3643.90;
        } else {
            return dress;
        }
    }

    public static float showDeductibleFood(float food) {
        if (food > 3643.90) {
            return (float) 14575.6;
        } else {
            return food;
        }
    }

    public static float showDeductibleEducation(float education) {
        if (education > 3643.90) {
            return (float) 3643.90;
        } else {
            return education;
        }
    }

    public static float showDeductibleHome(float home) {
        if (home > 3643.90) {
            return (float) 3643.90;
        } else {
            return home;
        }
    }

    public static float showDeductibleSum(float sum) {
        if (sum > 14575.6) {
            return (float) 14575.6;
        } else {
            return sum;
        }
    }

    public static float computeBaseTax(float baseTax, float taxFraction) {
        if (baseTax < 11212) {
            return 0;
        } else {
            if (baseTax < 14285) {
                return 0;
            } else {
                if (baseTax < 17854) {
                    return 154;
                } else {
                    if (baseTax < 21442) {
                        return 511;
                    } else {
                        if (baseTax < 42874) {
                            return 941;
                        } else {
                            if (baseTax < 64297) {
                                return 4156;
                            } else {
                                if (baseTax < 85729) {
                                    return 8440;
                                } else {
                                    if (baseTax > 144288) {
                                        return 13798;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return taxFraction;
    }

    public static float computeFinalTax(float baseTax, float totalTax) {
        if (baseTax < 11212) {
            return 0;
        } else {
            if (baseTax < 14285) {
                return (float) ((baseTax - 11212) * 0.05);
            } else {
                if (baseTax < 17854) {
                    return (float) ((baseTax - 14285) * 0.10);
                } else {
                    if (baseTax < 21442) {
                        return (float) ((baseTax - 17854) * 0.12);
                    } else {
                        if (baseTax < 42874) {
                            return (float) ((baseTax - 21442) * 0.15);
                        } else {
                            if (baseTax < 64297) {
                                return (float) ((baseTax - 42874) * 0.20);
                            } else {
                                if (baseTax < 85729) {
                                    return (float) ((baseTax - 64297) * 0.25);
                                } else {
                                    if (baseTax < 144288) {
                                        return (float) ((baseTax - 85729) * 0.30);

                                    } else {
                                        if (baseTax > 144288) {
                                            return (float) ((baseTax - 144288) * 0.35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return totalTax;
        }
    }
}
