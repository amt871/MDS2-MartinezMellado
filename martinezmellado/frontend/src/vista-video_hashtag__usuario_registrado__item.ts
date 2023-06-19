import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-video_hashtag__usuario_registrado__item')
export class VistaVideo_hashtag__usuario_registrado__item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start; justify-content: center;" theme="">
 <vaadin-horizontal-layout style="width: 100%; height: 95%; align-items: flex-start; justify-content: center;">
  <vaadin-horizontal-layout id="layoutVideo" style="max-width: 100%; max-height: 100%;"></vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 5%; align-items: flex-start; justify-content: center;">
  <label id="labelDescripcion">Descripcion</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
