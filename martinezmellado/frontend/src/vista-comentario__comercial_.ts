import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario__comercial__item';

@customElement('vista-comentario__comercial_')
export class VistaComentario__comercial_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
  <vista-comentario__comercial__item style="height: 20%;"></vista-comentario__comercial__item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
