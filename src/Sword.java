class Sword<T extends Metal> {
    private T material;

    public Sword(T material) {
        this.material = material;
    }

    public boolean checkStrength() {
        return material.getEndurance() > 49;
    }
}

