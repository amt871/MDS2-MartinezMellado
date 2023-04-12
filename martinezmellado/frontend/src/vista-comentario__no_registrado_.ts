import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario__no_registrado__item';

@customElement('vista-comentario__no_registrado_')
export class VistaComentario__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
  <vista-comentario__no_registrado__item style="height: 20%;"></vista-comentario__no_registrado__item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
