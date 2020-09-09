export class Pizza {

    id: string;
    title: string;
    description: string;
    cost: number;


    constructor(title: string, description: string, cost: number) {
        this.title = title;
        this.description = description;
        this.cost = cost;
    }
}
