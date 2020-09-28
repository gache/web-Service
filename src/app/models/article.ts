import { Image } from './image';


export interface Article {
  id: number;
  title: string;
  description: string;
  price: number;
  image: Array<Image>;
}
